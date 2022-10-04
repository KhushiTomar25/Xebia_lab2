#include <bits/stdc++.h>
using namespace std;
struct Node {
    int value;
    struct Node * skip;
};
Node *head;
Node *tail;

void createNode()
    {
        int A1;
        cin >> A1;
        Node *temp1 = new Node;
        temp1->value = A1;
        temp1->skip = NULL;

        if (head == NULL)
        {
            head = temp1;
            tail = temp1;
        }
        else
        {   
            tail->skip = temp1;
            tail = temp1;
        }
}

void insertNodeAtPosition(int loc, int A1)
{
      Node *pre = new Node;
      Node *current = new Node;
      Node *temp1 = new Node;
      current = head;

      for(int i = 1; i < loc; i++)
      {
          pre = current;
          current = current->skip;
      }
      temp1->value = A1;
      pre->skip = temp1; 
      temp1->skip = current;
}

void printList() {
        Node * current = head;

        while (current != NULL) {
            cout << current->value;
            current = current->skip;
        }
}

int main()
{
    for (int i =0; i < 13; i ++)
    {
        createNode();
    }
    int value1;
    cin >> value1;
    int value2;
    cin >> value2;
    insertNodeAtPosition(value1,value2);
    printList();
}

