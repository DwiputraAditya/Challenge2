import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData extends Rumus{

    public void createModus() throws IOException {
        String dir = "C:\\temp\\direktori\\";
        File folder = new File(dir);
        String fileName = "Data_Modus.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if(!file.exists()){
            file.createNewFile();
        }else{
            System.out.println("Terdapat file dengan nama yang sama!!");
        }
        FileWriter fw = new FileWriter(file);
        fw.write("Berikut data Modus\n");
        fw.write("Modus : " + getModus());
        fw.flush();
        fw.close();

    }

    public void createMean() throws IOException{
        String dir = "C:\\temp\\direktori\\";
        File folder = new File(dir);
        String fileName = "Data_Mean.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if(!file.exists()){
            file.createNewFile();
        }else{
            System.out.println("Terdapat file dengan nama yang sama!!");
        }

        FileWriter fw = new FileWriter(file);
        fw.write("Berikut data Mean\n");
        fw.write("Mean : " + getMean());
        fw.flush();
        fw.close();

    }

    public void createMedian() throws IOException{
        String dir = "C:\\temp\\direktori\\";
        File folder = new File(dir);
        String fileName = "Data_Median.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if(!file.exists()){
            file.createNewFile();
        }else{
            System.out.println("Terdapat file dengan nama yang sama!!");
        }

        FileWriter fw = new FileWriter(file);
        fw.write("Berikut data Median\n");
        fw.write("Median : " + getMedian());
        fw.flush();
        fw.close();
    }

    public void createBoth() throws IOException{
        createModus();
        createMean();
        createMedian();
    }

    public void createFrek() throws IOException{
        String dir = "C:\\temp\\direktori\\";
        File folder = new File(dir);
        String fileName = "Data_Frekuensi.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if(!file.exists()){
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("Nilai \t \t \t \t | Frekensi \n");
            fw.write("Jumlah Nilai Dibawah Lima \t |\t" + dibawah_lima +"\n");
            fw.write("5 \t \t \t \t \t |\t" + lima +"\n");
            fw.write("6 \t \t \t \t \t |\t" + enam +"\n");
            fw.write("7 \t \t \t \t \t |\t" + tujuh +"\n");
            fw.write("8 \t \t \t \t \t |\t" + delapan +"\n");
            fw.write("9 \t \t \t \t \t |\t" + sembilan +"\n");
            fw.write("10 \t \t \t \t \t |\t" + sepuluh +"\n \n");
            fw.write("Jumlah Frekuensi \t \t \t |\t" + Main.list.size() +"\n");
            fw.close();
        }else{
            System.out.println("Terdapat file dengan nama yang sama!!");
        }

    }

}