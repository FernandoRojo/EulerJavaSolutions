import java.util.ArrayList;
import java.util.Collections;


public class CyclicalFigurate {
	static ArrayList<Integer> tri = new ArrayList<Integer>();
	static ArrayList<Integer> squ = new ArrayList<Integer>();
	static ArrayList<Integer> pen = new ArrayList<Integer>();
	static ArrayList<Integer> hex = new ArrayList<Integer>();
	static ArrayList<Integer> hep = new ArrayList<Integer>();
	static ArrayList<Integer> oct = new ArrayList<Integer>();
	static ArrayList<Integer> all = new ArrayList<Integer>();
	static ArrayList<Integer> clean;
	static boolean sclean = false;
	static boolean pclean = false;
	static boolean hxclean = false;
	static boolean hpclean = false;
	static boolean tclean = false;
	public static void main(String[] args){
		int value = 1; 
		int n = 1;
		while (value<10000){
			int t = (n*(n+1))/2;
			if(t>1000 && t<10000){
				tri.add(t);
				all.add(t);
			}
			int s = n*n;
			if(s>1000 && s<10000){
				squ.add(s);
				all.add(s);}
			int p = (n*(3*n-1))/2;
			if(p>1000 && p<10000){
				pen.add(p);
				all.add(p);
			}
			int hx = n*(2*n-1);
			if(hx>1000 && hx<10000){
				hex.add(hx);
				all.add(hx);
			}
			int hp = (n*(5*n-3))/2;
			if(hp>1000 && hp<10000){
				hep.add(hp);
				all.add(hp);
			}
			int o = n*(3*n-2);
			if(o>1000 && o<10000){
				oct.add(o);
			}
			value = t;
			n++;
		}
		for(int p1  : oct){
			int pre = p1/100;
			int suf = p1%100;
			for (int i : all){
				if (suf==i/100){
					int newsuf = i%100;
					//System.out.println("found at " + p1 + "; " + i);
					ArrayList<Integer> clean = clean(i, all);
					for (int j : clean){
						if (j==2882){
						}
						if (newsuf==j/100){
							int newsuf1 = j%100;
							ArrayList<Integer> clean1 = clean(j, clean);
							for (int h : clean1){
								//System.out.println(h);
								if (newsuf1==h/100){
									int newsuf2 = h%100;
									//System.out.println("found at " + p1 + "; " + i + "; " + j + "; " + h);
									ArrayList<Integer> clean2 = clean(h, clean1);
									for (int g : clean2){
										if (newsuf2==g/100){
											int newsuf3=g%100;
											//System.out.println("found at " + p1 + "; " + i + "; " + j + "; " + h + "; " + g);
											ArrayList<Integer> clean3 = clean(g, clean2);
											for (int y : clean3){
												if (newsuf3==y/100&&pre==y%100){
													System.out.println("found at " + (p1+i +j + h + g + y));
												}
											}
											
										}
									}
								}
							}
						}
					}
				}
			}
			
		}

	}
	public static ArrayList<Integer> clean(int i, ArrayList<Integer> al){
		if (squ.contains(i)&& !sclean){
			al = cleaned(al, 4);
		}
		else if(tri.contains(i) && !tclean){
			al = cleaned(al, 3);
		}
		else if (pen.contains(i) &&!pclean){
			al = cleaned(al, 5);
		}
		else if(hex.contains(i) && !hxclean){
			al = cleaned(al, 6);
		}
		if (hep.contains(i)&&!hpclean){
			al = cleaned(al, 7);
		}
		return al;
	}
	public static ArrayList<Integer> cleaned(ArrayList<Integer> al, int j){
		ArrayList<Integer> cleaned = new ArrayList<Integer>();
		for (int k: al){
			if (j == 3){
				//if(tri.contains(k)&&!hex.contains(k))
				//	continue;
			}
			else if (j == 4){
				if(squ.contains(k))
					continue;
			}
			else if (j == 5){
				if(pen.contains(k))
					continue;
			}
			else if (j == 6){
				if(hex.contains(k))
					continue;
			}
			else if (j == 7){
				if(hep.contains(k))
					continue;
			}

			cleaned.add(k);	
		}
		return cleaned;
	}

}