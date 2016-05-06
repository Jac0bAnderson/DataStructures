package controller;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import model.*;
public class Controller 
{
private Queue<Customer> customerQueue;
private Stack<Dish> dishes;

public void start()
{
	doStuffToDishes();
	useTheCustomerQueue();
}
private void doStuffToDishes()
{
	dishes = new Stack<Dish>();
	dishes.addAll(new Dish(true, java.awt.Color.BLACK, 8));
	System.out.println(dishes.size());
	dishes.pop();
	dishes.pop(new Dish(false, java.awt.Color.GRAY,42));

}
private void useTheCustomerQueue()
{
	customerQueue = new LinkedList<Customer>();
	customerQueue.add(new Customer(false,"", 321.3));
	
	
}
}
