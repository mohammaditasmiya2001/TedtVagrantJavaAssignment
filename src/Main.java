import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class NewsPaper{
    public String name;
    public double pM,pT,pW,pTh,pF,pS,pSun,sum=0;

    public NewsPaper(String name, double pM, double pT, double pW, double pTh, double pF, double pS, double pSun) {
        this.name = name;
        this.pM = pM;
        this.pT = pT;
        this.pW = pW;
        this.pTh = pTh;
        this.pF = pF;
        this.pS = pS;
        this.pSun = pSun;
        this.sum = pM+pT+pW+pTh+pF+pS+pSun;
    }

    public NewsPaper() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getpM() {
        return pM;
    }

    public void setpM(double pM) {
        this.pM = pM;
    }

    public double getpT() {
        return pT;
    }

    public void setpT(double pT) {
        this.pT = pT;
    }

    public double getpW() {
        return pW;
    }

    public void setpW(double pW) {
        this.pW = pW;
    }

    public double getpTh() {
        return pTh;
    }

    public void setpTh(double pTh) {
        this.pTh = pTh;
    }

    public double getpF() {
        return pF;
    }

    public void setpF(double pF) {
        this.pF = pF;
    }

    public double getpS() {
        return pS;
    }

    public void setpS(double pS) {
        this.pS = pS;
    }

    public double getpSun() {
        return pSun;
    }

    public void setpSun(double pSun) {
        this.pSun = pSun;
    }
}
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<NewsPaper> papers = new ArrayList<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        NewsPaper TOI = new NewsPaper("TOI",3,3,3,3,3,5,6);
        papers.add(TOI);
        NewsPaper Hindu = new NewsPaper("Hindu",2.5,2.5,2.5,2.5,2.5,4,4);
        papers.add(Hindu);
        NewsPaper ET = new NewsPaper("ET",4,4,4,4,4,4,10);
        papers.add(ET);
        NewsPaper BM = new NewsPaper("BM",1.5,1.5,1.5,1.5,1.5,1.5,1.5);
        papers.add(BM);
        NewsPaper HT = new NewsPaper("HT",2,2,2,2,2,4,4);
        papers.add(HT);

        double inp = sc.nextDouble();

        for(int i=0;i<papers.size();i++){
            double sum1 = papers.get(i).sum;
            for(int j=i+1;j<papers.size();j++){
                double sum2 = papers.get(j).sum;
                if(sum1+sum2 <= inp){
                    ArrayList<String> res = new ArrayList<>();
                    res.add(papers.get(i).name);
                    res.add(papers.get(j).name);
                    result.add(res);
                }
            }
        }



    Iterator<ArrayList<String>> iter = result.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}