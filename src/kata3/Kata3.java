
package kata3;


public class Kata3 {

   
    public static void main(String[] args) {
       Histogram<String> histogram = new Histogram();
       histogram.increment("gmail.com");
       histogram.increment("gmail.com");
       histogram.increment("ulppgc.es");
       histogram.increment("ulppgc.es");
       histogram.increment("ull.es");
       histogram.increment("ull.es");
       histogram.increment("hotmail.com");
       
       new HistogramDisplay(histogram).execute();
    }
}
