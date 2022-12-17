package academy.learnprogramming.queues;

public class Main {

    public static void main(String[] args) {

        Employee PieckryBlinders = new Employee("pieckry", "blinders", 21);
        Employee RizkyBrigez = new Employee("rizky", "brigez", 19);
        Employee ReppyEinstein = new Employee("reppy", "einstein", 20);
        Employee FazryOzil = new Employee("fazry", "ozil", 23);
        Employee InoeBotax = new Employee("inoe", "botax", 37);

//        queue adalah struktur data linier yang menerapkan prinsip operasi dimana elemen data yang masuk pertama akan keluar lebih dulu.

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(PieckryBlinders);
        queue.add(RizkyBrigez);
        queue.add(ReppyEinstein);
        queue.add(FazryOzil);
        queue.add(InoeBotax);

//        fungsi add berfungsi untuk menambah data dalam queue(antrian)

        queue.remove();
        queue.remove();
//        fungsi remove adalah mengeluarkan antrian dari atas

//        fungsi size adalah untuk mengetahui jumlah antrian yang tersedia

        System.out.println(queue.size());


    }
}
