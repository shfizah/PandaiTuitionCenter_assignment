import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {

		//creating tutors name
		Name tutor1 = new Name("Husin","Bin","Hasin");
		Name tutor2 = new Name("Bedah","Bt","Jabit");
		Name tutor3 = new Name("Melati","Binti","Puteh");
		Name tutor4 = new Name("Melor","Binti","Hamad");
		Name tutor5 = new Name("Engku Haiqal","Bin","Engku Iskandar");
		Name tutor6 = new Name("Firdaus","Bin","Ismet");
		Name tutor7 = new Name("Ayam Azam","Bin","Anyau");

		//creating students name and address
		Name stud1 = new Name("Muhd Hazim","Bin","Mohamad");
		Name stud2 = new Name("Ubai","Bin","Namie");
		Name stud3 = new Name("Mat","Bin","Lutfi");
		Name stud4 = new Name("Adam","Bin","Iskandar");
		Address stud1_addr = new Address("31250","Ipoh","Perak");
		Address stud2_addr = new Address("21750","Temerloh","Pahang");
		Address stud3_addr = new Address("43200","Hulu Langat","Selangor");
		Address stud4_addr =new Address("32122","Kinta","Perak");

		//update marks for students
		ArrayList<Double> azim_sc = new ArrayList<>();
		azim_sc.add(56.9); azim_sc.add(90.0); azim_sc.add(78.8);

		ArrayList<Double> ubai_sc = new ArrayList<>();
		ubai_sc.add(87.0); ubai_sc.add(92.5); ubai_sc.add(100.0);

		ArrayList<Double> matLutfi_sc = new ArrayList<>();
		matLutfi_sc.add(78.9);matLutfi_sc.add(55.5);matLutfi_sc.add(82.0);

		ArrayList<Double> adam_sc = new ArrayList<>();
		adam_sc.add(67.5);adam_sc.add(90.4);adam_sc.add(88.0);

		//update student details
		Student azim = new Student(stud1,"031123143223",stud1_addr,2019,"SMK Balik Pulau");
		azim.setScores(azim_sc);

		Student ubai = new Student(stud2,"030122140997",stud2_addr,2018,"SBPI Gombak");
		ubai.setScores(ubai_sc);

		Student matLutfi = new Student(stud3,"031204120997",stud3_addr,2021,"MRSM Pekan");
		matLutfi.setScores(matLutfi_sc);

		Student adam = new Student(stud3,"041207320997",stud4_addr,2022,"MRSM Langkawi");
		adam.setScores(adam_sc);

		//creating batch object
		studentBatch sb03 = new studentBatch();
		studentBatch sb04 = new studentBatch();
		sb03.add(azim,0); sb03.add(ubai,1); sb03.add(matLutfi,2);
		sb04.add(adam);

		//creating headmasters and tutor
		HeadMaster awang = new HeadMaster("Awang B Alif","780202069007","0135678900");
		HeadMaster zaiton = new HeadMaster("Zaiton Binti Zamri","700223220988","012332456");
		HeadMaster sabariah = new HeadMaster("Sabariah bt Bakar","850301889006","0134543211");
		Tutor mrSin = new Tutor(tutor1,"750906100987","Jalan Raja Chulan","Master of Statiscs",10,new Date(23,5,2016),4);
		Tutor pnBedah = new Tutor(tutor2,"760912320998","Kota Bharu","PhD",10,new Date(12,4,2012),11);
		Tutor msMelati = new Tutor(tutor3,"890123069982","Pahang","IPG",3,new Date(19,3,2020),3);
		Tutor msMelor = new Tutor(tutor4,"940123063446","Penang","Diploma in Mathematics Mode",2,new Date(19,3,2018),5);
		Tutor mrHaiqal = new Tutor(tutor5,"950123329765","Putrajaya","Degree",5,new Date(10,6,2021),1);
		Tutor mrFirdaus = new Tutor(tutor6,"890223899977","Sabah","IPG",3,new Date(19,3,2022),3);
		Tutor mrAyam = new Tutor(tutor7,"970123069985","Sarawak","STPM",4,new Date(14,3,2020),1);

		//create and update data about tuition center
		TuitionCenter t1 = new TuitionCenter("Bukit Bintang Branch of Pandai","Kuala Lumpur",awang);
		t1.addTutor(mrSin);
		t1.addTutor(msMelati);
		t1.addTutor(msMelor);
		t1.removeTutor(msMelor);
		t1.addTutor(mrAyam);
		t1.addStudent(azim);
		t1.addStudent(matLutfi);

		TuitionCenter t2 = new TuitionCenter("Skudai Branch of Pandai","Johor Bahru",zaiton);
		t2.addTutor(pnBedah);
		t2.addTutor(mrHaiqal);
		t2.addTutor(mrFirdaus);
		t2.addStudent(ubai);

		TuitionCenter t3 = new TuitionCenter("Iskandar Puteri Branch of Pandai","Johor Bahru",sabariah);
		t3.addTutor(pnBedah);
		t3.addTutor(msMelor);
		t3.addStudent(adam);
		t3.getSb();

		//display report
		TuitionCenterReport bktBintangReport = new TuitionCenterReport(t1);
		bktBintangReport.generateReport();

		TuitionCenterReport skudaiReport = new TuitionCenterReport(t2);
		skudaiReport.generateReport();

		TuitionCenterReport IskandarPutri = new TuitionCenterReport(t3);
		IskandarPutri.generateReport();
	}
}
