import java.sql.*;
import java.awt.*;
import java.awt.event.*;
class SrfDemodb extends Frame implements ItemListener,ActionListener {
	Label regno,name,gender,degree,branch,yos,dob,address,emailid,hobby,extraact,entrydetails,srf;
	TextField regn,nam,addr,email;
	TextArea details;
	Choice  d,b,ys,date1,month1,year1;
	Checkbox sc,rn,pt;
	CheckboxGroup gen;
	Checkbox male,female;
	List exa;
	Button sub,cle,del,upd,btnfirst,btnlast,btnprevious,btnnext;
	SrfDemodb(){
		setVisible(true);
		setSize(new Dimension(1050,900));
		setTitle("Student Registration Form");
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font ("Arial",Font.BOLD,20));
		setLayout(null);
		
		srf=new Label("STUDENT RESPONSE FORM");
		srf.setFont(new Font("Serif",Font.BOLD,30));
		srf.setBounds(300,50, 500,70);
		add(srf);
		
		regno=new Label("Register No.");
		regno.setBounds(30, 170,150, 30);  
		regn=new TextField(10);
		regn.setBounds(200, 170,180, 30); 
		add(regno);
		add(regn);
		regn.addActionListener(this);	
	
		name=new Label("Name",Label.LEFT);
		name.setBounds(30,230,150, 30); 
		nam=new TextField(10);
		nam.setBounds(200,230,180, 30);
		add(name);
		add(nam);
		
		gender=new Label("Gender",Label.LEFT);
		gender.setBounds(30,280,150, 30); 
		gen=new CheckboxGroup();
		male=new Checkbox("Male",true,gen);
		female=new Checkbox("Female",false,gen);
		male.setBounds(200,280,80, 30); 
		female.setBounds(280,280,100, 30); 
		add(gender);
		add(male);
		add(female);
	
		degree=new Label("Degree",Label.LEFT);
		degree.setBounds(30,330,150,30); 
		d=new Choice();
		d.setBounds(200,330,150,30); 
		d.addItem("b.tech.");
		d.addItem("bsc.");
		add(degree);
		add(d);
	
		branch=new Label("Branch",Label.LEFT);
		branch.setBounds(30,380,150,30); 
		b=new Choice();
		b.setBounds(200,380,150,30);
		b.addItem("cse");
		b.addItem("it");
		b.addItem("ict");
		b.addItem("ece");
		b.addItem("mech");
		b.addItem("civil");
		b.addItem("bio");
		b.addItem("chem");
		b.addItem("eie");
		add(branch);
		add(b);
		

		yos=new Label("Year of Study",Label.LEFT);
		yos.setBounds(30,430,150,30); 
		ys=new Choice();
		ys.setBounds(200,430,150,30);
		ys.addItem("1");
		ys.addItem("2");
		ys.addItem("3");
		ys.addItem("4");
		add(yos);
		add(ys);
	
		dob=new Label("Date of Birth",Label.LEFT);
		dob.setBounds(30,480,150,30);
		date1=new Choice();
		date1.setBounds(200,480,50,30);
		for(int i=1;i<=31;i++){
		date1.addItem(i+"");
		}
		month1=new Choice();
		month1.setBounds(260,480,50,30);
		for(int i=1;i<13;i++){
		month1.addItem(i+"");
		}
		year1=new Choice();
		year1.setBounds(320,480,80,30);
		for(int i=1996;i<2002;i++){
		year1.addItem(i+"");
		}
		add(dob);
		add(date1);
		add(month1);
		add(year1);
		
		address=new Label("Address",Label.LEFT);
		address.setBounds(30,530,150,30);
		addr=new TextField(10);
		addr.setBounds(200,530,180,120);
		add(address);
		add(addr);
	
		emailid=new Label("E-Mail Id",Label.LEFT);
		emailid.setBounds(30,670,150,30);
		email=new TextField(10);
		email.setBounds(200,670,180,30);
		add(emailid);
		add(email);
		
		sub=new Button("SUBMIT");
		sub.setBounds(100,750,100,30);
		add(sub);
		cle=new Button("CLEAR");
		cle.setBounds(300,750,100,30);
		add(cle);
		del=new Button("DELETE");
		del.setBounds(500,750,100,30);
		add(del);
		upd=new Button("UPDATE");
		upd.setBounds(700,750,100,30);	
		add(upd);
	
		hobby=new Label("Hobby",Label.LEFT);
		hobby.setBounds(450,170,70, 30); 
		sc=new Checkbox("Stamp Collection");
		sc.setBounds(520,170,180, 30);
		rn=new Checkbox("Reading Novels");
		rn.setBounds(700,170,160, 30);
		pt=new Checkbox("Playing Tennis");
		pt.setBounds(860,170,160, 30);
		add(hobby);
		add(sc);
		add(rn);
		add(pt);

		extraact=new Label("Extra Curricular Activities",Label.LEFT);
		extraact.setBounds(450,230,250, 30);
		exa=new List();  
		exa.setBounds(480,280,150, 100);
		exa.add("Tennis");
		exa.add("Cricket");
		exa.add("basketball");
		exa.add("piano");
		exa.add("violin");
		add(extraact);
		add(exa);
				
		entrydetails=new Label("You Entered",Label.LEFT);
		entrydetails.setBounds(450,400,150,30); 
		details=new TextArea("");
		details.setBounds(480,450,500,250);
		add(entrydetails);
		add(details);
		
		sub.addActionListener(this);		
		cle.addActionListener(this);
		del.addActionListener(this);
		upd.addActionListener(this);
		
		btnfirst=new Button("<<");
		btnprevious=new Button("<");
		btnnext=new Button(">");
		btnlast=new Button(">>");
		btnfirst.setBounds(100,800,100,30);
		btnprevious.setBounds(300,800,100,30);
		btnnext.setBounds(500,800,100,30);
		btnlast.setBounds(700,800,100,30);
		
		add(btnfirst);
		add(btnprevious);
		add(btnnext);
		add(btnlast);		

		btnfirst.addActionListener(this);	
		btnprevious.addActionListener(this);
		btnnext.addActionListener(this);
		btnlast.addActionListener(this);
		
		Myad me=new Myad();
		addWindowListener(me);	
	}
	public void actionPerformed(ActionEvent ae){
		try{	
				
				
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con=DriverManager.getConnection("jdbc:derby:studentdb;create=true");
			Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		Graphics g=getGraphics();
		String s1=ae.getActionCommand();
		
		if(s1.equals("SUBMIT")){
			
			if(regn.getText().equals("")||nam.getText().equals("")){
				g.drawString("name and regno can't be empty",30,800);
			}
		
				System.out.println("done2");
		
				
				stm.execute("insert into student values("+Integer.parseInt(regn.getText())+",'"+nam.getText()+"','"+male.getLabel()+"','"+d.getSelectedItem()+"','"+b.getSelectedItem()+"',"+Integer.parseInt(ys.getSelectedItem())+","+Integer.parseInt(date1.getSelectedItem())+","+Integer.parseInt(month1.getSelectedItem())+","+Integer.parseInt(year1.getSelectedItem())+",'"+addr.getText()+"','"+email.getText()+"',"+sc.getState()+","+rn.getState()+","+pt.getState()+",'"+exa.getSelectedItem()+"')");
				
			System.out.println("done");	

		
		
		}
		if(s1.equals("CLEAR")){
			details.setText("");
			
			nam.setText("");
			
			regn.setText("");
			
			addr.setText(" ");
			
			email.setText(" ");

		}
		if(s1.equals("DELETE")){
			
				stm.execute("delete from student where sregno="+Integer.parseInt(regn.getText()));
			
		}
		if(s1.equals("UPDATE")){
			
		
				stm.execute("update student set sname='"+nam.getText()+"',sgender='"+male.getLabel()+"',sdegree='"+d.getSelectedItem()+"',sbranch='"+b.getSelectedItem()+"',syos="+Integer.parseInt(ys.getSelectedItem())+",sbdate="+Integer.parseInt(date1.getSelectedItem())+",sbmonth="+Integer.parseInt(month1.getSelectedItem())+",sbyear="+Integer.parseInt(year1.getSelectedItem())+",saddr='"+addr.getText()+"',semail='"+email.getText()+"',ssc="+sc.getState()+",srn="+rn.getState()+",spt="+pt.getState()+",sexa='"+exa.getSelectedItem()+"' where sregno="+Integer.parseInt(regn.getText())+" ");
			
		
		}
		ResultSet rs=stm.executeQuery("select * from student");
		
		String msg="";
		
		while(rs.next()){
			msg+=rs.getInt("sregno")+rs.getString("sname")+rs.getString("sdegree")+rs.getString("sbranch")+rs.getInt("syos")+rs.getInt("sbdate")+rs.getInt("sbmonth")+rs.getInt("sbyear")+rs.getString("saddr")+rs.getString("semail")+rs.getBoolean("ssc")+rs.getBoolean("srn")+rs.getBoolean("spt")+rs.getString("sexa")+"\n";
			
			details.setText(msg);
			repaint();
		}

		
		if(s1.equals("<<")){
			rs.first();
			String a="";
			a+=rs.getInt("sregno")+rs.getString("sname")+rs.getString("sdegree")+rs.getString("sbranch")+rs.getInt("syos")+rs.getInt("sbdate")+rs.getInt("sbmonth")+rs.getInt("sbyear")+rs.getString("saddr")+rs.getString("semail")+rs.getBoolean("ssc")+rs.getBoolean("srn")+rs.getBoolean("spt")+rs.getString("sexa")+"\n";
			details.setText(a);
			repaint();
		}	
		if(s1.equals("<")){
			rs.previous();
			String b="";
			b+=rs.getInt("sregno")+rs.getString("sname")+rs.getString("sdegree")+rs.getString("sbranch")+rs.getInt("syos")+rs.getInt("sbdate")+rs.getInt("sbmonth")+rs.getInt("sbyear")+rs.getString("saddr")+rs.getString("semail")+rs.getBoolean("ssc")+rs.getBoolean("srn")+rs.getBoolean("spt")+rs.getString("sexa")+"\n";
			details.setText(b);
			repaint();
		}	
		if(s1.equals(">>")){
			rs.last();
			String c="";
			c+=rs.getInt("sregno")+rs.getString("sname")+rs.getString("sdegree")+rs.getString("sbranch")+rs.getInt("syos")+rs.getInt("sbdate")+rs.getInt("sbmonth")+rs.getInt("sbyear")+rs.getString("saddr")+rs.getString("semail")+rs.getBoolean("ssc")+rs.getBoolean("srn")+rs.getBoolean("spt")+rs.getString("sexa")+"\n";
			details.setText(c);
			repaint();
		}	
		if(s1.equals(">")){
			rs.next();
			String d="";
			d+=rs.getInt("sregno")+rs.getString("sname")+rs.getString("sdegree")+rs.getString("sbranch")+rs.getInt("syos")+rs.getInt("sbdate")+rs.getInt("sbmonth")+rs.getInt("sbyear")+rs.getString("saddr")+rs.getString("semail")+rs.getBoolean("ssc")+rs.getBoolean("srn")+rs.getBoolean("spt")+rs.getString("sexa")+"\n";
			details.setText(d);
			repaint();
		}
		}catch(Exception e){System.out.println("caught exception..."+e);}
	}
	public void itemStateChanged(ItemEvent ie){
	}
	public static void main(String args[]){
		new SrfDemodb();
	}
	
}
class Myad extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}	

