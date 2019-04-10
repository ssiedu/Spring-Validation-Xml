package com.ssi;

public class InterestBean {

	private int amount;
	private int rate=10;
	private int time;
	private int interest;
	private int net;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
		calculate();
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
		calculate();
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	public int getNet() {
		return net;
	}
	public void setNet(int net) {
		this.net = net;
	}
	private void calculate(){
		if(time>=5){
			rate=12;
		}
		interest=amount*time*rate/100;
		net=amount+interest;
	}
	
	
	
}
