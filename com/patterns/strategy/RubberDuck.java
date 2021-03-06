/**
 * 
 */
package com.patterns.strategy;

/**
 * @author User
 *
 */
public class RubberDuck extends Duck{

	public RubberDuck() {
		super();
		setName("Rubber Duck");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _name;
	}
	
	private void setName(String newName)
	{
	  this._name = newName;	
	}

	@Override
	public void fly() {
		System.out.println("This Duck : " + _name + " is not flying");
	};
	
	@Override
	public void quack() {
		System.out.println("This Quack Duck : " + _name + " is not quacking");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside Display Duck name " + _name );	

	}

}
