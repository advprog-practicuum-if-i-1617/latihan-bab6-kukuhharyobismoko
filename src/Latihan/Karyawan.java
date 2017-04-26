package Inheritance;
public class Karyawan {
    private String nama,posisi;
    private double gajiPokok=2500000,bonus,masaKerja;
    public Karyawan(String nama, String posisi, double masaKerja) {
        this.nama = nama;
        this.posisi = posisi;
        this.masaKerja = masaKerja;
    }
    public String getNama(){return nama;}
    public String getPosisi(){return posisi;}
    public double getMasaKerja() {return masaKerja;}
    public double getBonus() {
        if (masaKerja>5) return bonus=250000;
        else return bonus=0;
    }
    public double getTotal(){
        return gajiPokok+getBonus();
    }
}
class SoftwareEngineer extends Karyawan{
    private double tunjangan=5500000,bonusSE=300000;
    public SoftwareEngineer(String nama, String posisi, double masaKerja) {
        super(nama, posisi, masaKerja);
    }
    public double getTotalGaji(){
        return getTotal()+tunjangan+bonusSE;
    }
}
class ProjectManager extends Karyawan {
    private double tunjangan=6000000,bonusPM=450000,bonusApresiasi;
    public ProjectManager(String nama, String posisi, double masaKerja) {
        super(nama, posisi, masaKerja);
    }
    public double getBonusApresiasi() {
        if(getMasaKerja()>=10) return bonusApresiasi=700000;
        else return bonusApresiasi=225000;
    }
    public double getTotalGaji(){
        return getTotal()+tunjangan+bonusPM+getBonusApresiasi();
    }
}
class mainKaryawan {
    public static void main(String[] args) {
        SoftwareEngineer s=new SoftwareEngineer("Dicky","SE",7);
        System.out.println("Nama : "+s.getNama()+", Posisi : "+s.getPosisi()+" ,Masa Kerja :  "+s.getMasaKerja()+", Salary : "+s.getTotalGaji());
        SoftwareEngineer s1=new SoftwareEngineer("Singkek","SE",4);
        System.out.println("Nama : "+s1.getNama()+", Posisi : "+s1.getPosisi()+" ,Masa Kerja :  "+s1.getMasaKerja()+", Salary : "+s1.getTotalGaji());
        ProjectManager p=new ProjectManager("Wardi","PM",10);
        System.out.println("Nama : "+p.getNama()+", Posisi : "+p.getPosisi()+",Masa Kerja : "+p.getMasaKerja()+", Salary : "+p.getTotalGaji());
        ProjectManager p1=new ProjectManager("Iqbal","PM",7);
        System.out.println("Nama : "+p1.getNama()+", Posisi : "+p1.getPosisi()+",Masa Kerja : "+p1.getMasaKerja()+", Salary : "+p1.getTotalGaji());
    }
}