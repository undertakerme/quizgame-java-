import java.util.*;
class q14
{
    void main()
    {
        char n='y';
        while(n=='y'||n=='Y')
        {
            System.out.print("Enter name of Player :");
            String nm=new Scanner(System.in).nextLine();
            System.out.print("Enter the Subject you want to play [Physics/Chemistry/Biology] :");
            char sub=new Scanner(System.in).next().charAt(0);
            int c=0;
            char ans;
            sub=Character.toUpperCase(sub);
            System.out.println("ENTER THE CHOICE[a/b/c] ONLY");
            switch(sub)
            {        
                case 'B' : {
                    System.out.println("1.Human Heart Has __ Chambers.\na.2\tb.3\tc.4");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='c'||ans=='C')
                        c++;
                    System.out.println("2.Colour Photoreceptor in Human Eye is __\na.Rods\tb.Cones\tc.Both a&b");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("3.Which One is an Enzyme?\na.Thyroxine\tb.Maltase\tc.Insulin");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("4.A Superficial Artery \na.Radial Artery\tb.Aorta\tc.Renal Artery");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;
                    System.out.println("5.Sudden Increase in Insulin causes \na.Insulin Shock\tb.Glycosuria\tc.Both a&b");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;
                    System.out.println("6.__ Regulated Calcium and Phosphate level in Blood \na.Cortisol\tb.Calcitonin\nc.Thyroxine");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("7.__Prevents concentration of Urine\na.ADH\tb.Vasopressin\tc.any of a&b");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='c'||ans=='C')
                        c++;  
                    System.out.println("8.Oxygen produced in Photosynthesis comes from\na.CarbonDioxide\tb.Water\tc.Glucose");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("9.Adenine always forms bonds with \na.Thymine\tb.Guanine\tc.Cytosine");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;    
                    System.out.println("10.Number of Cranial nerves in Humans \na.12\tb.24\tc.20");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println(nm+" Your Final Score :"+c);
                    break;
                }
                case 'C':{
                    System.out.println("1.Which of the gases is not colourless\na.Chlorine\tb.Hydrogen\tc.Oxygen");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;
                    System.out.println("2.Which is the most Electronegative element  \na.Flourine\tb.Bromine\tc.Chlorine");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='c'||ans=='C')
                        c++;
                    System.out.println("3.Poor conductor of heat is __\na.Carbon\tb.Sulphur\tc.Iron");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("4.Which of the Ores of Iron contain Sulphur \na.Magnetite\tb.Haematite\tc.Pyrite");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='c'||ans=='C')
                        c++;  
                    System.out.println("5.Which is the called Lewis Acid \na.NH3\tb.AlCl3\tc.HCl");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;  
                    System.out.println("6.Which addition product causes Brown Ring  \na.FeSO4.NO\tb.CuSO4.5H2O\tc.FeSO4.7H2O");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;    
                    System.out.println("7.Industrinal Process of Manufacturing of HNO3  \na.Ostwald'sProcess\tb.Contact Process\tc.Haber's Process");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++; 
                    System.out.println("8.Chemical formula of sugar  \na.C2H5O2\tb.C12H22O11\tc.C32H69O23");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("9.Roasting could be used for \na.FeS\tb.CaCO3\tc.Al2O3");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++; 
                    System.out.println("10.A Reddish Brown Gas  \na.H2S\tb.SO2\tc.NO2");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='c'||ans=='C')
                        c++; 
                    System.out.println(nm+" Your Final Score :"+c);
                    break; 
                }
                case 'P':{    
                    System.out.println("1. Magnetic field inside a solenoid is:  \na.radial\tb.uniform\tc.circular");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("2.S.I. unit of charge  \na.coloumb\tb.ampere\tc.watt");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;
                    System.out.println("3.waves produced by supersonic jet planes   \na.shock \tb.infrasonic\tc.seismic");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;
                    System.out.println("4.a machine with efficiency 100% is   \na.ideal\tb.practical\tc.none of above");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;
                    System.out.println("5.which of the following is capable of producing virtual diminished image of real object  \na.concave mirror\tb.convex mirror\tc.plane mirrror");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;
                    System.out.println("6. two equal opposite and parallel forces are called  \na.triplet\tb.quadraplet\tc.couple");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='c'||ans=='C')
                        c++;
                    System.out.println("7. formula for force(N):  \na.p*a\tb.m*a\tc.g*a");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("8. speed of light:  \na.3*10^8m/s\tb.3*10^8km/s\tc.6.9*10^32m/s");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='a'||ans=='A')
                        c++;
                    System.out.println("9. v=(3t^2+2t+1)m/s value of v when t is 12 \na.469.28\tb.457\tc.392.69");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='b'||ans=='B')
                        c++;
                    System.out.println("10.One material wave is   \na.magnetic\tb.light\tc.sound");
                    ans=new Scanner(System.in).next().charAt(0);
                    if(ans=='c'||ans=='C')
                        c++;
                        System.out.println(nm+" Your Final Score :"+c);
                    break;
                }
                default:System.out.println("wrong subject entered");
            }
            System.out.println("any more students left[Y/N]");
            n=new Scanner(System.in).next().charAt(0);
            }
        }
    }