#include"./demo/DemoPortal.h"
#include<fstream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	DemoPortal Portal(1);//Creating a new Portal (with PortalID ==1..as default PortalID...)
	string s="",Query="";
	ofstream Myfile1;
    Myfile1.open("PortalToPlatform.txt",std::ofstream::out | std::ofstream::trunc);//opening the fle "PortalToPlatform.txt" and clearing contents if there are any in the file.
    Myfile1.close();//close the file after doing the above process...
	while(true)
	{
		cin>>s;//take input from user..
		if(s=="Check")//if it input command is Check then Portal starts checking if there are any Responses from the Platform...
		{
			cout<<"Checking..."<<endl;
			Portal.checkResponse();//check the PlatformtoPortal.txt file if there are any response form the PLatform
		}
		else
		{
			//in other cases the user commands are requests to Platform..i.e List, Buy, Start...
			getline(cin,Query);//taking the user command..
			Query=s+Query;
			cout<<"Processing your Request..."<<endl;
			Portal.processUserCommand(Query);//Process user request command..
		}
	}
}