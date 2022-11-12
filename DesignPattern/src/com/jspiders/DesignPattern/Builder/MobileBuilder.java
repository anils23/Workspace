package com.jspiders.DesignPattern.Builder;

public class MobileBuilder {
	
	String model;
	String brand;
	int ram;
	int rom;
	String processor;
	int battery;
	int frontCamera;
	int rearCamera;
	double price;
	String color;
	boolean fingerprint;
	
	    public MobileBuilder model(String model) {
		    this.model=model;
		    return this;
		    }

	    public MobileBuilder brand(String brand) {
			this.brand=brand;
			return this;
			}
	    
	    public MobileBuilder ram(int ram) {
			this.ram=ram;
			return this;
			}
	    
	    public MobileBuilder rom(int rom) {
			this.rom=rom;
			return this;
	        }

	    public MobileBuilder processor(String processor) {
			this.processor=processor;
			return this;
			}
 
	    public MobileBuilder battery(int battery) {
			this.battery=battery;
			return this;
	        }
	    
	    public MobileBuilder frontCamera(int frontCamera) {
			this.frontCamera=frontCamera;
			return this;
	        }
	    
	    public MobileBuilder rearCamera(int rearCamera) {
			this.rearCamera=rearCamera;
			return this;
	        }
	    
	    public MobileBuilder price(double price) {
			this.price=price;
			return this;
	        }
	    
	    public MobileBuilder color(String color) {
			this.color=color;
			return this;
	        }
	    
	    public MobileBuilder fingerprint(boolean fingerprint) {
			this.fingerprint=fingerprint;
			return this;
	        }

        public Mobile build() {
        	
        	Mobile obj=new Mobile(this.model,this.brand,this.ram,this.rom,this.processor,this.battery,this.frontCamera,this.rearCamera,this.price,this.color,
        			this.fingerprint);
        	return obj;
        }
        	    
	    
}
