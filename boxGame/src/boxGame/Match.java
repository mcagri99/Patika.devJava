package boxGame;

public class Match {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight ){
		
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
		}
  
	
	public void run() {
		if(isCheck()) {
			
			while(this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("===New Round===");
				if(isStart()) {
				this.f2.health = this.f1.hit(this.f2);
				if(isWin()) {
					break;
				}
				this.f1.health = this.f2.hit(this.f1);
				if(isWin()) {
					break;
				}
				System.out.println(this.f1.name + " Saglik " + this.f1.health);
				System.out.println(this.f2.name + " Saglik " + this.f2.health);
				
			}
				else {
					this.f1.health = this.f2.hit(this.f1);
					if(isWin()) {
						break;
					}
					this.f2.health = this.f1.hit(this.f2);
					if(isWin()) {
						break;
					}
					System.out.println(this.f1.name + " Saglik " + this.f1.health);
					System.out.println(this.f2.name + " Saglik " + this.f2.health);
					
				}
				}
			}
			
			
			
		
		else {
			System.out.println("Dovusculerin sikletleri uymuyor!!");
		}
		
		
	}
	
	boolean isCheck() {
		return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) & (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}
	
	boolean isWin() {
		if(this.f1.health == 0) {
			System.out.println(this.f2.name + " kazandi!");
			return true;
		}
		
		if(this.f2.health == 0) {
			System.out.println(this.f1.name + " kazandi!");
			return true;
		
	}
		else return false;
	}
	
	boolean isStart() {
		double randomNum = Math.random() * 10;
		if(randomNum<=5)
			return true;
		else return false;
	}
}
