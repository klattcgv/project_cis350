#include"lab3.h"

struct node node;
void display(struct node *head){  
  
  struct node *ptr = head;
   printf("\n[ ");

		if(ptr->next!=NULL){
			ptr=ptr->next;
			while(ptr != NULL) {
      printf("%d",ptr->data);
      ptr = ptr->next;
   }
		}
			 
   //start from the beginning
   printf(" ]");
 
}

struct node *init (){
    struct node *newNode = malloc(sizeof(node));
    return newNode;
}

void insert(struct node *head, int data){   
  struct node *ptr = head;
	  struct node *link = (struct node*) malloc(sizeof(node));

   link->data = data;
	
   //point it to old first node
   link->next = NULL;
		
  while(ptr->next!=NULL){
    ptr=ptr->next;
  }
   //point first to new first node
   ptr->next=link;
}

void deleteAll (struct node *head){
/* deref head_ref to get the real head */
   struct node *current = head;
   struct node *next;
 
   while (current != NULL)
   {
      printf("\n delete %d",current->data);
       next = current->next;
       free(current);
       current = next;
		 }
	 head->next=NULL;
   /* deref head_ref to affect the real head back
      in the caller. */
}