#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <windows.h>
#include <math.h>

using namespace std;


int main(int argc, char *argv[]){
	HANDLE OutputH;
	COORD position;
	
	OutputH = GetStdHandle(STD_OUTPUT_HANDLE);
	
	while(!kbhit()){
		position.X = (int) rand()%120;
		position.Y = (int) rand()%48;
		
		if(rand()%2==0)
			SetConsoleTextAttribute(OutputH,0x02);
		else
			SetConsoleTextAttribute(OutputH,0x0A);
		
			//SetConsoleTextAttribute(OutputH, rand()%255);	
		SetConsoleCursorPosition (OutputH, position);
		
		if(rand()%2==0)
			cout << "0";
		else
			cout << "1";
					
	}
	
	return 0;
}
