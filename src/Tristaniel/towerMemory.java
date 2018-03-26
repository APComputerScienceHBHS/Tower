package Tristaniel;

public class towerMemory {

	private int[][] intSet;
	private Disk a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
	private Disk[] diskSet;
	private Disk[][] mem;
	private boolean endBool, firstRun;

	private Tower tow;

	public towerMemory(Tower tow) {
		this.tow = tow;
	}

	public void run() {
		runner();
		if (firstRun == false) {
			setup();
		}
		else {
			helper();
		}
		print();
	}

	private void runner() {
		diskSet = new Disk[7];
		mem = new Disk[3][7];
	}

	private void setup() {
		intSet = tow.getState();
		a = new Disk(intSet[1][0]);
		b = new Disk(intSet[1][1]);
		c = new Disk(intSet[1][2]);
		d = new Disk(intSet[1][3]);
		e = new Disk(intSet[1][4]);
		f = new Disk(intSet[1][5]);
		g = new Disk(intSet[1][6]);
		h = new Disk(intSet[2][0]);
		i = new Disk(intSet[2][1]);
		j = new Disk(intSet[2][2]);
		k = new Disk(intSet[2][3]);
		l = new Disk(intSet[2][4]);
		m = new Disk(intSet[2][5]);
		n = new Disk(intSet[2][6]);
		o = new Disk(intSet[3][0]);
		p = new Disk(intSet[3][1]);
		q = new Disk(intSet[3][2]);
		r = new Disk(intSet[3][3]);
		s = new Disk(intSet[3][4]);
		t = new Disk(intSet[3][5]);
		u = new Disk(intSet[3][6]);
		
		mem[0][0] = a;
		mem[0][1] = b;
		mem[0][2] = c;
		mem[0][3] = d;
		mem[0][4] = e;
		mem[0][5] = f;
		mem[0][6] = g;
		mem[1][0] = h;
		mem[1][1] = i;
		mem[1][2] = j;
		mem[1][3] = k;
		mem[1][4] = l;
		mem[1][5] = m;
		mem[1][6] = n;
		mem[2][0] = o;
		mem[2][1] = p;
		mem[2][2] = q;
		mem[2][3] = r;
		mem[2][4] = s;
		mem[2][5] = t;
		mem[2][6] = u;
		
		firstRun = true;
	}

	private void helper() {
		a.setSize(intSet[1][0]);
		b.setSize(intSet[1][1]);
		c.setSize(intSet[1][2]);
		d.setSize(intSet[1][3]);
		e.setSize(intSet[1][4]);
		f.setSize(intSet[1][5]);
		g.setSize(intSet[1][6]);
		h.setSize(intSet[2][0]);
		i.setSize(intSet[2][1]);
		j.setSize(intSet[2][2]);
		k.setSize(intSet[2][3]);
		l.setSize(intSet[2][4]);
		m.setSize(intSet[2][5]);
		n.setSize(intSet[2][6]);
		o.setSize(intSet[3][0]);
		p.setSize(intSet[3][1]);
		q.setSize(intSet[3][2]);
		r.setSize(intSet[3][3]);
		s.setSize(intSet[3][4]);
		t.setSize(intSet[3][5]);
		u.setSize(intSet[3][6]);
	
		mem[0][0] = a;
		mem[0][1] = b;
		mem[0][2] = c;
		mem[0][3] = d;
		mem[0][4] = e;
		mem[0][5] = f;
		mem[0][6] = g;
		mem[1][0] = h;
		mem[1][1] = i;
		mem[1][2] = j;
		mem[1][3] = k;
		mem[1][4] = l;
		mem[1][5] = m;
		mem[1][6] = n;
		mem[2][0] = o;
		mem[2][1] = p;
		mem[2][2] = q;
		mem[2][3] = r;
		mem[2][4] = s;
		mem[2][5] = t;
		mem[2][6] = u;
	}

	private void print() {
		System.out.println(mem[0][6].runner() + " | " + mem[1][6].runner() + " | " + mem[2][6].runner());
		System.out.println(mem[0][5].runner() + " | " + mem[1][5].runner() + " | " + mem[2][5].runner());
		System.out.println(mem[0][4].runner() + " | " + mem[1][4].runner() + " | " + mem[2][4].runner());
		System.out.println(mem[0][3].runner() + " | " + mem[1][3].runner() + " | " + mem[2][3].runner());
		System.out.println(mem[0][2].runner() + " | " + mem[1][2].runner() + " | " + mem[2][2].runner());
		System.out.println(mem[0][1].runner() + " | " + mem[1][1].runner() + " | " + mem[2][1].runner());
		System.out.println(mem[0][0].runner() + " | " + mem[1][0].runner() + " | " + mem[2][0].runner());
	}
}