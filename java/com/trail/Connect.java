package com.trail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
 //@RequestMapping(value="/A")
public class Connect {
	@GetMapping(value="/show")
  public String title() {
	  return "HELLO WORLD!";
  }
	@RequestMapping(value="/first")
	public String check() {
		return "AJAY RUBAN WALTER A";
	}
	@GetMapping(value="/game/{name}")
	public String game(@PathVariable String name) {
		return name+"Welcome!";
	}
	@GetMapping(value="/detail/{name}/{age}/{gender}")
	public String names(@PathVariable String name,@PathVariable int age,@PathVariable String gender) {
		return "Name: "+name+" Age:"+age+" Gender: "+gender;
	}
	@GetMapping(value="/add/{a}/{b}")
	public int calculation(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	@GetMapping(value="/find/{a}")
	public String oddEven(@PathVariable int a) {
		if(a%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		
		}
	}
		@GetMapping(value="/prime/{a}")
		public String prime(@PathVariable int a) {
			boolean isPrime=true;
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					isPrime=false;
				}
				}
			if(isPrime==true) {
				return "Prime";
			}
			else {
				return "Not a Prime";
			}
		}
		@GetMapping(value="/square/{nums}")
			public String square(@PathVariable("nums") int n){
				return "Square of "+n*n;
			}
		
		//@GetMapping(value="/max/{a}/{b}/{c}/{d}")
		//public int maxi(@PathVariable int a,@PathVariable int b,@PathVariable int c,@PathVariable int d) {
	 // int[]nums= {a,b,c,d};
	//*	int max=0;
		//for(int i=0;i<=nums.length;i++) {
			//if(nums[i]>max) {
				//max=nums[i];
			//}
		//}
		//return max;
		@GetMapping(value="/login")
		public String check(@RequestParam("username") String u,@RequestParam("password") String p) {
			if(u.equalsIgnoreCase("Ajayruban")&&p.equalsIgnoreCase("12345678")){
				return "Valid Person";
			}
			else {
				return "Invalid Person";
			}
		}
		@GetMapping(value="laps")
		public Laptop lap(@RequestBody Laptop lp) {
			return lp;
		}
		@GetMapping(value="/lapies")
			public List<Laptop> laps(@RequestBody List<Laptop> ls) {
			return  ls;
		}
		public String getName() {
			return "ajay";
		}
}

