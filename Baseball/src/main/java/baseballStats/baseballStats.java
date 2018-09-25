package baseballStats;

import java.util.Scanner;

public class baseballStats {
	private String playerName;
	
	private int H;
	private int AB;
	private int BB;
	private int HBP;
	private int SF;
	private int HR;
	private int dbl;
	private int triple;
	private int R;
	
	public String playerName() {
		return name;
	}
	public void setName(String playerName) {
		this.playerName = playerName;
	}
	public void baseballStat(int hits, int aB, int bB, int sF, int dbl, int triple, int HR, int R) {
	H = hits;
	AB = aB;
	BB = bB;
	HBP = getHBP();
	SF = sF;
	this.dbl = dbl;
	this.triple = triple;
	int hR;
	HR = hR;
	}
	public int getHits() {
		return Hits;
	}
	public void setHit(int hits) {
		Hits = hits;
	}
	public int getAB() {
		return AB;
	}
	public void setAB(int aB) {
		AB = aB;
	}
	public int getBB() {
		return BB;
	}
	public void setBB(int bB) {
		BB = bB;
	}
	public int getHBP() {
		return HBP;
	}
	public void setHBP(int hBP) {
		HBP = hBP;
	}
	public int getSF() {
		return SF;
	}
	public void setSF(int sF) {
		SF = sF;
	}
	public int getDbl() {
		return dbl;
	}
	public void setDbl(int dbl) {
		this.dbl = dbl;
	}
	public int getTriple() {
		return triple;
	}
	public void setTriple(int triple) {
		this.triple = triple;
	}
	public int getHR() {
		return HR;
	}
	public void setHR(int hR) {
		HR = hR;
	}
	public double SLG() {
		int singles = this.Hits - this.dbl - this.triple - this.HR;
		double slg = (singles + (2*this.dbl) + (3*this.triple) + (4*this.HR)) / this.AB;
		return slg
	}
	public double OBP() {
		int nom = (Hits + BB + HBP);
		int denom = (AB + BB + HBP + SF);
		return nom / denom;
	}
	public double OBS() {
		return SLG() + OBP();
	}
	public int TB() {
		return (getHits() + (2*dbl) + (3*triple) + (4*HR));
	}
	public double BA() {
		return TB()/AB;
	}
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	 baseballStats stats = new baseballStats();
	 System.out.println("Enter player's name: ");
	 stats.setName(sc.nextLine());
	 System.out.println("At Bats: ");
	 stats.setAB(sc.nextInt());
	 System.out.println("Hits: ");
	 stats.setHit(sc.nextInt());
	 System.out.println("Doubles: ");
	 stats.setDbl(sc.nextInt());
	 System.out.println("Triples: ");
	 stats.setTriple(sc.nextInt());
	 System.out.println("Homeruns: ");
	 stats.setHR(sc.nextInt());
	 System.out.println("Runs: ");
	 stats.setHBP(sc.nextInt());
	 System.out.println("Walks: ");
	 stats.setBB(sc.nextInt());
	 
	 System.out.println("Batting Average is: " + stats.BA());
	 System.out.println("On Base % is: " + stats.OBP());
	 System.out.println("Slug %: " + stats.SLG());
	 System.out.println("On Base and Slug %: " + stats.OBS());
	 System.out.println("Total Bases: " + stats.TB());
}
}