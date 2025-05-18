public class  Main {
    public static void main(String[] args) {
        String[] [] lirik = {
            {"Did we ever know?","0.5"},
            {"Did we ever know?","0.5"},
            {"Did we ever know?","1.2"},
            {"","1.2"},
            {"Is it all inside of my head?","1.0"},
            {"Maybe you still think I don't care","1.2"},
            {"But all I need is you","0.9"},
            {"Yeah, you know it's true","0.3"},
            {"Yeah, you know it's true","0.7"},
            {"Forget about where we are and let go","1.5"},
            {"","0.5"},
            {"We're so close","0.5"},
            {"If you don't know where to start, just hold on","1.3"},
            {"And don't run, no","1.0"}
        };
        double faktorPerlambat = 3.0;
        for (String[] bagian : lirik) {String baris = bagian[0]; double waktuAsli =
        Double.parseDouble(bagian[1]); long totalMillis = (long) (waktuAsli * faktorPerlambat * 1000);
        int jumlahHuruf = 
        Math.max(baris.length(), 1); 
                    long delayPerhuruf = totalMillis / jumlahHuruf;
    for (char huruf : baris.toCharArray()) {
        System.out.print(huruf); try {Thread.sleep(delayPerhuruf);
        } catch
        (InterruptedException e) {
            System.out.println("\nGangguan saat animasi huruf.");
        }
        }
        System.out.println();
        try {
            Thread.sleep(400);
        } catch
        (InterruptedException e){
            System.out.println("Gangguan saat jeda baris.");
    }
    }
    }
}