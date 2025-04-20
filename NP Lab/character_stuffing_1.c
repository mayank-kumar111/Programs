// Character Stuffing
#include <stdio.h>
#include<string.h>
void charStuff(char *frame){
    char result[50];
    int len=strlen(frame),j=0,i;
    result[j++]='s';
    result[j++]='t';
    result[j++]='x';
    result[j++]='d';
    result[j++]='l';
    result[j++]='e';
    for(i=0;i<len;i++){
        if(frame[i]=='d' && frame[i+1]=='l' && frame[i+2]=='e')
        {           
                    result[j++]='d';
                    result[j++]='l';
                    result[j++]='e';
        }
        result[j++]=frame[i];
    }
    result[j++]='d';
    result[j++]='l';
    result[j++]='e';
    result[j++]='e';
    result[j++]='t';
    result[j++]='x';
    result[j]='\0';
    printf("\nStuffed Frame: ");
    printf("%s",result);
}
int main() {
    char frame[50];
    printf("\nEnter frame: ");
    scanf("%s",frame);
    printf("\nFrame: ");
    printf("%s",frame);
    charStuff(frame);
    return 0;
}