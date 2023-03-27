PortalMain: PortalMain.o DemoPortal.o Portal.o Algos.o
	g++ PortalMain.o DemoPortal.o Portal.o Algos.o -o PortalMain.out

PortalMain.o: PortalMain.cpp
	g++ -c PortalMain.cpp

DemoPortal.o: ./demo/DemoPortal.cpp ./demo/DemoPortal.h
	g++ -c ./demo/DemoPortal.cpp

Portal.o: ./ecomm/Portal.cpp 
	g++ -c ./ecomm/Portal.cpp

Algos.o: ./demo/Algos.cpp
	g++ -c ./demo/Algos.cpp
clean:
	rm *.o
	rm *.out
	find . -name "*.class" -type f -delete
	find . -name "*:Zone.Identifier" -type f -delete
	find . -name "*.Zone.Identifier" -type f -delete
