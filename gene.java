public class Gene {
    public String findSimpleGene(String dna, int startCodon, int stopCodon){
        
        if(startCodon == -1)
        {
            return "";
        }
       
         if(stopCodon == -1)
        {
            return "";
        }
        if((stopCodon-startCodon)%3==0){
            String s=dna.substring(startCodon, stopCodon+3);
            
        return s;
    }
        return "";
    }
    public void testSimpleGene(){
        String dna;
        int startIndex;
        int stopIndex;
        dna="atgatctaa";
        System.out.println("DNA is "+dna);
        
        startIndex= dna.toUpperCase().indexOf("ATG");
        stopIndex=dna.toUpperCase().indexOf("TAA",startIndex+3);
        
        System.out.println("Gene is "+findSimpleGene(dna,startIndex,stopIndex).toLowerCase());
        
        dna="ATGGCTTCA";
        startIndex= dna.indexOf("ATG");
        stopIndex=dna.indexOf("TAA",startIndex+3);
        System.out.println("DNA is "+dna);
        System.out.println("Gene is "+findSimpleGene(dna,startIndex,stopIndex));
        
        dna="ATGATCTAA";
        startIndex= dna.indexOf("ATG");
        stopIndex=dna.indexOf("TAA",startIndex+3);
        System.out.println("DNA is "+dna);
        System.out.println("Gene is "+findSimpleGene(dna,startIndex,stopIndex));
        
        dna="ATGATTAAC";
        startIndex= dna.indexOf("ATG");
        stopIndex=dna.indexOf("TAA",startIndex+3);
        System.out.println("DNA is "+dna);
        System.out.println("Gene is "+findSimpleGene(dna,startIndex,stopIndex));
    }

}
