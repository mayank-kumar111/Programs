#include <stdio.h>
#include<stdlib.h>
#include<conio.h>
//#include<conio.h>

void addrecord();
void viewrecord();
void searchrecord();
void deleterecord();
struct student {
    char name[20];
    int roll_no;
    char Class[10];
    float marks;
};
 
void main()
{
    int choice;
    while(choice!=5){
     printf("STUDENT RECORD\n");
     printf("1. Add Record\n");
     printf("2. View Records\n");
     printf("3. Search Record\n");
     printf("4. Delete Record\n");
     printf("5. Exit\n");
     scanf("%d",&choice);
    
     switch(choice){
         case 1:
             system("cls");
             addrecord();
             system("cls");
             break;

         case 2: 
             system("cls");
             viewrecord();
             getch();
             system("cls");
             break;
        
         case 3:
             system("cls");
             searchrecord();
             printf("Press any key to exit.......\n");
             getch();
             system("cls");
             break;
  
         case 4:
             system("cls");
             deleterecord();
             printf("Press any key to exit.......\n");
             getch();
             system("cls");
            break;

         case 5:
             system("cls");
             printf("Exit\n\n");
             exit(1);
             break;
        
         default :
             system("cls");
             getch();
             printf("Enter a valid number\n\n");
             printf("Press any key to continue.......");
             getch();
             system("cls");
             break;
        }
    }
getch();
}
    
void addrecord(){
   
    char another;
    FILE *fp;
    int n,i;
    struct student info;
   do{
        system("cls");
        printf("Add Students Information\n\n\n"); 
        fp=fopen("mayank.txt","a");
        printf("Enter Name : \n");
        scanf("%s",&info.name);
        fflush(stdin);
        printf("Enter Roll Number : \n");
        scanf("%d",&info.roll_no);
        fflush(stdin);
        printf("Enter Class : \n");
        scanf("%s",&info.Class);
        fflush(stdin);
        printf("Enter Marks : \n");
        scanf("%f",&info.marks);
       
        if(fp==NULL){
            fprintf(stderr,"File not exist ");
        }
        else{
            printf("Record stored successfuly\n");
        }
    
        fwrite(&info, sizeof(struct student), 1, fp); 
        fclose(fp);
    
        printf("You want to add another record?(y/n) : ");
        scanf("%s",&another);
    
     }while(another=='y'||another=='Y');
}

void viewrecord(){
   
    FILE *fp;
    struct student info;
    fp=fopen("mayank.txt","r");
    printf("STUDENTS RECORD\n\n\n");
      
    if(fp==NULL){
        fprintf(stderr,"can't open file\n");
        exit(1);
    }
    else{
        printf("RECORDS :\n");
    }
        
    while(fread(&info,sizeof(struct student),1,fp)){
        printf("\n Student Name : %s",info.name);
        printf("\n Roll NO : %d",info.roll_no);
        printf("\n Class : %s",info.Class);
        printf("\n Marks : %f",info.marks);
    }
 
 printf("Enter any key to Exit ........ ");
 fclose(fp);
 getch();
 
 
 
 system("cls");
 
 
}
 
void searchrecord(){
    struct student info;
    FILE *fp;
    int roll_no,found=0;
    fp=fopen("mayank.txt","r");
    printf("SEARCH STUDENTS RECORD\n\n\n");
    printf("Enter the roll number (Exist) : ");
    scanf("%d",&roll_no);
     
 while(fread(&info,sizeof(struct student),1,fp)>0){
        if(info.roll_no==roll_no){
            found=1;
            printf("\nStudent Name : %s",info.name);
            printf("\nRoll NO : %d",info.roll_no);
            printf("\nClass : %s",info.Class);
            printf("\nMarks : %f",info.marks);  
        }
    }
     
 if(!found){
       printf("Record not found\n");
    }
 printf("Enter any key to exit ......... ");
 fclose(fp);
 getch();
 system("cls");
 
 
}    

void deleterecord(){
    struct student info;
    FILE *fp, *fp1;
    int roll_no,found=0;
    printf("DELETE STUDENTS RECORD\n\n\n");
    fp=fopen("mayank.txt","r");
    fp1=fopen("temp.txt","w");
    printf("Enter the roll number (exist): ");
    scanf("%d",&roll_no);
    if(fp==NULL){
        fprintf(stderr,"can't open file\n");
        exit(0);
    }
    
    while(fread(&info,sizeof(struct student),1,fp)){
        if(info.roll_no==roll_no){
            found=1;
        }
        else{
            fwrite(&info,sizeof(struct student),1,fp1);
        }
    }
    fclose(fp);
    fclose(fp1);
 
    if(!found){
        printf("Record not found\n");
    }
    if(found){ 
        remove("mayank.txt");
        rename("temp.txt","mayank.txt");
        printf("Record deleted succesfully\n");
    }
 printf("Enter ant key to exit ........ ");
 getch();
 system("cls");
 
}