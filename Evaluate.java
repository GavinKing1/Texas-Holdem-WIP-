import java.util.*;

public class Evaluate {
  public static double eval(ArrayList<String> hand) {
    String num1 = hand.get(0).substring(0,hand.get(0).length()-1);
    String num2 = hand.get(1).substring(0,hand.get(1).length()-1);
    String num3 = hand.get(2).substring(0,hand.get(2).length()-1);
    String num4 = hand.get(3).substring(0,hand.get(3).length()-1);
    String num5 = hand.get(4).substring(0,hand.get(4).length()-1);
    String suit1 = hand.get(0).substring(hand.get(0).length()-1);
    String suit2 = hand.get(1).substring(hand.get(1).length()-1);
    String suit3 = hand.get(2).substring(hand.get(2).length()-1);
    String suit4 = hand.get(3).substring(hand.get(3).length()-1);
    String suit5 = hand.get(4).substring(hand.get(4).length()-1);

    int aces = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0, sevens = 0, eights = 0, nines = 0, tens = 0, jacks = 0, queens = 0, kings = 0;
    for (int j = 0; j < 5; j++) {
      if (hand.get(j).substring(0,hand.get(j).length()-1).equals("Ace"))
        aces++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("2"))
        twos++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("3"))
        threes++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("4"))
        fours++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("5"))
        fives++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("6"))
        sixes++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("7"))
        sevens++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("8"))
        eights++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("9"))
        nines++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("10"))
        tens++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("Jack"))
        jacks++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("Queen"))
        queens++;
      else if (hand.get(j).substring(0,hand.get(j).length()-1).equals("King"))
        kings++;
    } // for end
    
    boolean flush = false;
    if (suit1.equals(suit2) && suit2.equals(suit3) && suit3.equals(suit4) && suit4.equals(suit5))
      flush = true;

    if (aces == 1 && kings == 1 && queens == 1 && jacks == 1 && tens == 1 && flush)
      return 10.00;
    
    if (flush) {
      if (kings == 1 && queens == 1 && jacks == 1 && tens == 1 && nines == 1)
        return 9.13;
      if (queens == 1 && jacks == 1 && tens == 1 && nines == 1 && eights == 1)
        return 9.12;
      if (jacks == 1 && tens == 1 && nines == 1 && eights == 1 && sevens == 1)
        return 9.11;
      if (tens == 1 && nines == 1 && eights == 1 && sevens == 1 && sixes == 1)
        return 9.10;
      if (nines == 1 && eights == 1 && sevens == 1 && sixes == 1 && fives == 1)
        return 9.09;
      if (eights == 1 && sevens == 1 && sixes == 1 && fives == 1 && fours == 1)
        return 9.08;
      if (sevens == 1 && sixes == 1 && fives == 1 && fours == 1 && threes == 1)
        return 9.07;
      if (sixes == 1 && fives == 1 && fours == 1 && threes == 1 && twos == 1)
        return 9.06;
      if (fives == 1 && fours == 1 && threes == 1 && twos == 1 && aces == 1)
        return 9.05;
    } // if end

    if (aces == 4) {
      if (kings == 1)
        return 8.1413;
      if (queens == 1)
        return 8.1412;
      if (jacks == 1)
        return 8.1411;
      if (tens == 1)
        return 8.1410;
      if (nines == 1)
        return 8.1409;
      if (eights == 1)
        return 8.1408;
      if (sevens == 1)
        return 8.1407;
      if (sixes == 1)
        return 8.1406;
      if (fives == 1)
        return 8.1405;
      if (fours == 1)
        return 8.1404;
      if (threes == 1)
        return 8.1403;
      if (twos == 1)
        return 8.1402;
    } // if end
    if (kings == 4) {
      if (aces == 1)
        return 8.1314;
      if (queens == 1)
        return 8.1312;
      if (jacks == 1)
        return 8.1311;
      if (tens == 1)
        return 8.1310;
      if (nines == 1)
        return 8.1309;
      if (eights == 1)
        return 8.1308;
      if (sevens == 1)
        return 8.1307;
      if (sixes == 1)
        return 8.1306;
      if (fives == 1)
        return 8.1305;
      if (fours == 1)
        return 8.1304;
      if (threes == 1)
        return 8.1303;
      if (twos == 1)
        return 8.1302;
    } // if end
    if (queens == 4) {
      if (kings == 1)
        return 8.1213;
      if (aces == 1)
        return 8.1214;
      if (jacks == 1)
        return 8.1211;
      if (tens == 1)
        return 8.1210;
      if (nines == 1)
        return 8.1209;
      if (eights == 1)
        return 8.1208;
      if (sevens == 1)
        return 8.1207;
      if (sixes == 1)
        return 8.1206;
      if (fives == 1)
        return 8.1205;
      if (fours == 1)
        return 8.1204;
      if (threes == 1)
        return 8.1203;
      if (twos == 1)
        return 8.1202;
    } // if end
    if (jacks == 4) {
      if (kings == 1)
        return 8.1113;
      if (queens == 1)
        return 8.1112;
      if (aces == 1)
        return 8.1114;
      if (tens == 1)
        return 8.1110;
      if (nines == 1)
        return 8.1109;
      if (eights == 1)
        return 8.1108;
      if (sevens == 1)
        return 8.1107;
      if (sixes == 1)
        return 8.1106;
      if (fives == 1)
        return 8.1105;
      if (fours == 1)
        return 8.1104;
      if (threes == 1)
        return 8.1103;
      if (twos == 1)
        return 8.1102;
    } // if end
    if (tens == 4) {
      if (kings == 1)
        return 8.1013;
      if (queens == 1)
        return 8.1012;
      if (jacks == 1)
        return 8.1011;
      if (aces == 1)
        return 8.1014;
      if (nines == 1)
        return 8.1009;
      if (eights == 1)
        return 8.1008;
      if (sevens == 1)
        return 8.1007;
      if (sixes == 1)
        return 8.1006;
      if (fives == 1)
        return 8.1005;
      if (fours == 1)
        return 8.1004;
      if (threes == 1)
        return 8.1003;
      if (twos == 1)
        return 8.1002;
    } // if end
    if (nines == 4) {
      if (kings == 1)
        return 8.0913;
      if (queens == 1)
        return 8.0912;
      if (jacks == 1)
        return 8.0911;
      if (tens == 1)
        return 8.0910;
      if (aces == 1)
        return 8.0914;
      if (eights == 1)
        return 8.0908;
      if (sevens == 1)
        return 8.0907;
      if (sixes == 1)
        return 8.0906;
      if (fives == 1)
        return 8.0905;
      if (fours == 1)
        return 8.0904;
      if (threes == 1)
        return 8.0903;
      if (twos == 1)
        return 8.0902;
    } // if end
    if (eights == 4) {
      if (kings == 1)
        return 8.0813;
      if (queens == 1)
        return 8.0812;
      if (jacks == 1)
        return 8.0811;
      if (tens == 1)
        return 8.0810;
      if (aces == 1)
        return 8.0814;
      if (nines == 1)
        return 8.0809;
      if (sevens == 1)
        return 8.0807;
      if (sixes == 1)
        return 8.0806;
      if (fives == 1)
        return 8.0805;
      if (fours == 1)
        return 8.0804;
      if (threes == 1)
        return 8.0803;
      if (twos == 1)
        return 8.0802;
    } // if end
    if (sevens == 4) {
      if (kings == 1)
        return 8.0713;
      if (queens == 1)
        return 8.0712;
      if (jacks == 1)
        return 8.0711;
      if (tens == 1)
        return 8.0710;
      if (aces == 1)
        return 8.0714;
      if (eights == 1)
        return 8.0708;
      if (nines == 1)
        return 8.0709;
      if (sixes == 1)
        return 8.0706;
      if (fives == 1)
        return 8.0705;
      if (fours == 1)
        return 8.0704;
      if (threes == 1)
        return 8.0703;
      if (twos == 1)
        return 8.0702;
    } // if end
    if (sixes == 4) {
      if (kings == 1)
        return 8.0613;
      if (queens == 1)
        return 8.0612;
      if (jacks == 1)
        return 8.0611;
      if (tens == 1)
        return 8.0610;
      if (aces == 1)
        return 8.0614;
      if (eights == 1)
        return 8.0608;
      if (sevens == 1)
        return 8.0607;
      if (nines == 1)
        return 8.0609;
      if (fives == 1)
        return 8.0605;
      if (fours == 1)
        return 8.0604;
      if (threes == 1)
        return 8.0603;
      if (twos == 1)
        return 8.0602;
    } // if end
    if (fives == 4) {
      if (kings == 1)
        return 8.0513;
      if (queens == 1)
        return 8.0512;
      if (jacks == 1)
        return 8.0511;
      if (tens == 1)
        return 8.0510;
      if (aces == 1)
        return 8.0514;
      if (eights == 1)
        return 8.0508;
      if (sevens == 1)
        return 8.0507;
      if (sixes == 1)
        return 8.0506;
      if (nines == 1)
        return 8.0509;
      if (fours == 1)
        return 8.0504;
      if (threes == 1)
        return 8.0503;
      if (twos == 1)
        return 8.0502;
    } // if end
    if (fours == 4) {
      if (kings == 1)
        return 8.0413;
      if (queens == 1)
        return 8.0412;
      if (jacks == 1)
        return 8.0411;
      if (tens == 1)
        return 8.0410;
      if (aces == 1)
        return 8.0414;
      if (eights == 1)
        return 8.0408;
      if (sevens == 1)
        return 8.0407;
      if (sixes == 1)
        return 8.0406;
      if (fives == 1)
        return 8.0405;
      if (nines == 1)
        return 8.0409;
      if (threes == 1)
        return 8.0403;
      if (twos == 1)
        return 8.0402;
    } // if end
    if (threes == 4) {
      if (kings == 1)
        return 8.0313;
      if (queens == 1)
        return 8.0312;
      if (jacks == 1)
        return 8.0311;
      if (tens == 1)
        return 8.0310;
      if (aces == 1)
        return 8.0314;
      if (eights == 1)
        return 8.0308;
      if (sevens == 1)
        return 8.0307;
      if (sixes == 1)
        return 8.0306;
      if (fives == 1)
        return 8.0305;
      if (fours == 1)
        return 8.0304;
      if (nines == 1)
        return 8.0309;
      if (twos == 1)
        return 8.0302;
    } // if end
    if (twos == 4) {
      if (kings == 1)
        return 8.0213;
      if (queens == 1)
        return 8.0212;
      if (jacks == 1)
        return 8.0211;
      if (tens == 1)
        return 8.0210;
      if (aces == 1)
        return 8.0214;
      if (eights == 1)
        return 8.0208;
      if (sevens == 1)
        return 8.0207;
      if (sixes == 1)
        return 8.0206;
      if (fives == 1)
        return 8.0205;
      if (fours == 1)
        return 8.0204;
      if (threes == 1)
        return 8.0203;
      if (nines == 1)
        return 8.0209;
    } // if end
    
    if (aces == 3) {
      if (kings == 2)
        return 7.1413;
      if (queens == 2)
        return 7.1412;
      if (jacks == 2)
        return 7.1411;
      if (tens == 2)
        return 7.1410;
      if (nines == 2)
        return 7.1409;
      if (eights == 2)
        return 7.1408;
      if (sevens == 2)
        return 7.1407;
      if (sixes == 2)
        return 7.1406;
      if (fives == 2)
        return 7.1405;
      if (fours == 2)
        return 7.1404;
      if (threes == 2)
        return 7.1403;
      if (twos == 2)
        return 7.1402;
    } // if end
    if (kings == 3) {
      if (aces == 2)
        return 7.1314;
      if (queens == 2)
        return 7.1312;
      if (jacks == 2)
        return 7.1311;
      if (tens == 2)
        return 7.1310;
      if (nines == 2)
        return 7.1309;
      if (eights == 2)
        return 7.1308;
      if (sevens == 2)
        return 7.1307;
      if (sixes == 2)
        return 7.1306;
      if (fives == 2)
        return 7.1305;
      if (fours == 2)
        return 7.1304;
      if (threes == 2)
        return 7.1303;
      if (twos == 2)
        return 7.1302;
    } // if end    
    if (queens == 3) {
      if (kings == 2)
        return 7.1213;
      if (aces == 2)
        return 7.1214;
      if (jacks == 2)
        return 7.1211;
      if (tens == 2)
        return 7.1210;
      if (nines == 2)
        return 7.1209;
      if (eights == 2)
        return 7.1208;
      if (sevens == 2)
        return 7.1207;
      if (sixes == 2)
        return 7.1206;
      if (fives == 2)
        return 7.1205;
      if (fours == 2)
        return 7.1204;
      if (threes == 2)
        return 7.1203;
      if (twos == 2)
        return 7.1202;
    } // if end  
    if (jacks == 3) {
      if (kings == 2)
        return 7.1113;
      if (queens == 2)
        return 7.1112;
      if (aces == 2)
        return 7.1114;
      if (tens == 2)
        return 7.1110;
      if (nines == 2)
        return 7.1109;
      if (eights == 2)
        return 7.1108;
      if (sevens == 2)
        return 7.1107;
      if (sixes == 2)
        return 7.1106;
      if (fives == 2)
        return 7.1105;
      if (fours == 2)
        return 7.1104;
      if (threes == 2)
        return 7.1103;
      if (twos == 2)
        return 7.1102;
    } // if end  
    if (tens == 3) {
      if (kings == 2)
        return 7.1013;
      if (queens == 2)
        return 7.1012;
      if (jacks == 2)
        return 7.1011;
      if (aces == 2)
        return 7.1014;
      if (nines == 2)
        return 7.1009;
      if (eights == 2)
        return 7.1008;
      if (sevens == 2)
        return 7.1007;
      if (sixes == 2)
        return 7.1006;
      if (fives == 2)
        return 7.1005;
      if (fours == 2)
        return 7.1004;
      if (threes == 2)
        return 7.1003;
      if (twos == 2)
        return 7.1002;
    } // if end  
    if (nines == 3) {
      if (kings == 2)
        return 7.0913;
      if (queens == 2)
        return 7.0912;
      if (jacks == 2)
        return 7.0911;
      if (tens == 2)
        return 7.0910;
      if (aces == 2)
        return 7.0914;
      if (eights == 2)
        return 7.0908;
      if (sevens == 2)
        return 7.0907;
      if (sixes == 2)
        return 7.0906;
      if (fives == 2)
        return 7.0905;
      if (fours == 2)
        return 7.0904;
      if (threes == 2)
        return 7.0903;
      if (twos == 2)
        return 7.0902;
    } // if end  
    if (eights == 3) {
      if (kings == 2)
        return 7.0813;
      if (queens == 2)
        return 7.0812;
      if (jacks == 2)
        return 7.0811;
      if (tens == 2)
        return 7.0810;
      if (aces == 2)
        return 7.0814;
      if (nines == 2)
        return 7.0809;
      if (sevens == 2)
        return 7.0807;
      if (sixes == 2)
        return 7.0806;
      if (fives == 2)
        return 7.0805;
      if (fours == 2)
        return 7.0804;
      if (threes == 2)
        return 7.0803;
      if (twos == 2)
        return 7.0802;
    } // if end  
    if (sevens == 3) {
      if (kings == 2)
        return 7.0713;
      if (queens == 2)
        return 7.0712;
      if (jacks == 2)
        return 7.0711;
      if (tens == 2)
        return 7.0710;
      if (aces == 2)
        return 7.0714;
      if (eights == 2)
        return 7.0708;
      if (nines == 2)
        return 7.0709;
      if (sixes == 2)
        return 7.0706;
      if (fives == 2)
        return 7.0705;
      if (fours == 2)
        return 7.0704;
      if (threes == 2)
        return 7.0703;
      if (twos == 2)
        return 7.0702;
    } // if end  
    if (sixes == 3) {
      if (kings == 2)
        return 7.0613;
      if (queens == 2)
        return 7.0612;
      if (jacks == 2)
        return 7.0611;
      if (tens == 2)
        return 7.0610;
      if (aces == 2)
        return 7.0614;
      if (eights == 2)
        return 7.0608;
      if (sevens == 2)
        return 7.0607;
      if (nines == 2)
        return 7.0609;
      if (fives == 2)
        return 7.0605;
      if (fours == 2)
        return 7.0604;
      if (threes == 2)
        return 7.0603;
      if (twos == 2)
        return 7.0602;
    } // if end  
    if (fives == 3) {
      if (kings == 2)
        return 7.0513;
      if (queens == 2)
        return 7.0512;
      if (jacks == 2)
        return 7.0511;
      if (tens == 2)
        return 7.0510;
      if (aces == 2)
        return 7.0514;
      if (eights == 2)
        return 7.0508;
      if (sevens == 2)
        return 7.0507;
      if (sixes == 2)
        return 7.0506;
      if (nines == 2)
        return 7.0509;
      if (fours == 2)
        return 7.0504;
      if (threes == 2)
        return 7.0503;
      if (twos == 2)
        return 7.0502;
    } // if end  
    if (fours == 3) {
      if (kings == 2)
        return 7.0413;
      if (queens == 2)
        return 7.0412;
      if (jacks == 2)
        return 7.0411;
      if (tens == 2)
        return 7.0410;
      if (aces == 2)
        return 7.0414;
      if (eights == 2)
        return 7.0408;
      if (sevens == 2)
        return 7.0407;
      if (sixes == 2)
        return 7.0406;
      if (fives == 2)
        return 7.0405;
      if (nines == 2)
        return 7.0409;
      if (threes == 2)
        return 7.0403;
      if (twos == 2)
        return 7.0402;
    } // if end  
    if (threes == 3) {
      if (kings == 2)
        return 7.0313;
      if (queens == 2)
        return 7.0312;
      if (jacks == 2)
        return 7.0311;
      if (tens == 2)
        return 7.0310;
      if (aces == 2)
        return 7.0314;
      if (eights == 2)
        return 7.0308;
      if (sevens == 2)
        return 7.0307;
      if (sixes == 2)
        return 7.0306;
      if (fives == 2)
        return 7.0305;
      if (fours == 2)
        return 7.0304;
      if (nines == 2)
        return 7.0309;
      if (twos == 2)
        return 7.0302;
    } // if end  
    if (twos == 3) {
      if (kings == 2)
        return 7.0213;
      if (queens == 2)
        return 7.0212;
      if (jacks == 2)
        return 7.0211;
      if (tens == 2)
        return 7.0210;
      if (aces == 2)
        return 7.0214;
      if (eights == 2)
        return 7.0208;
      if (sevens == 2)
        return 7.0207;
      if (sixes == 2)
        return 7.0206;
      if (fives == 2)
        return 7.0205;
      if (fours == 2)
        return 7.0204;
      if (threes == 2)
        return 7.0203;
      if (nines == 2)
        return 7.0209;
    } // if end

    if (flush) {
      if (aces >= 1) {
        if (kings >= 1)
          return 6.1413;
        if (queens >= 1)
          return 6.1412;
        if (jacks >= 1)
          return 6.1411;
        if (tens >= 1)
          return 6.1410;
        if (nines >= 1)
          return 6.1409;
        if (eights >= 1)
          return 6.1408;
        if (sevens >= 1)
          return 6.1407;
        if (sixes >= 1)
          return 6.1406;
        if (fives >= 1)
          return 6.1405;
        if (fours >= 1)
          return 6.1404;
        if (threes >= 1)
          return 6.1403;
        if (twos >= 1)
          return 6.1402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 6.1312;
        if (jacks >= 1)
          return 6.1311;
        if (tens >= 1)
          return 6.1310;
        if (nines >= 1)
          return 6.1309;
        if (eights >= 1)
          return 6.1308;
        if (sevens >= 1)
          return 6.1307;
        if (sixes >= 1)
          return 6.1306;
        if (fives >= 1)
          return 6.1305;
        if (fours >= 1)
          return 6.1304;
        if (threes >= 1)
          return 6.1303;
        if (twos >= 1)
          return 6.1302;
      } // if end      
      if (queens >= 1) {
        if (jacks >= 1)
          return 6.1211;
        if (tens >= 1)
          return 6.1210;
        if (nines >= 1)
          return 6.1209;
        if (eights >= 1)
          return 6.1208;
        if (sevens >= 1)
          return 6.1207;
        if (sixes >= 1)
          return 6.1206;
        if (fives >= 1)
          return 6.1205;
        if (fours >= 1)
          return 6.1204;
        if (threes >= 1)
          return 6.1203;
        if (twos >= 1)
          return 6.1202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 6.1110;
        if (nines >= 1)
          return 6.1109;
        if (eights >= 1)
          return 6.1108;
        if (sevens >= 1)
          return 6.1107;
        if (sixes >= 1)
          return 6.1106;
        if (fives >= 1)
          return 6.1105;
        if (fours >= 1)
          return 6.1104;
        if (threes >= 1)
          return 6.1103;
        if (twos >= 1)
          return 6.1102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 6.1009;
        if (eights >= 1)
          return 6.1008;
        if (sevens >= 1)
          return 6.1007;
        if (sixes >= 1)
          return 6.1006;
        if (fives >= 1)
          return 6.1005;
        if (fours >= 1)
          return 6.1004;
        if (threes >= 1)
          return 6.1003;
        if (twos >= 1)
          return 6.1002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 6.0908;
        if (sevens >= 1)
          return 6.0907;
        if (sixes >= 1)
          return 6.0906;
        if (fives >= 1)
          return 6.0905;
        if (fours >= 1)
          return 6.0904;
        if (threes >= 1)
          return 6.0903;
        if (twos >= 1)
          return 6.0902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 6.0807;
        if (sixes >= 1)
          return 6.0806;
        if (fives >= 1)
          return 6.0805;
        if (fours >= 1)
          return 6.0804;
        if (threes >= 1)
          return 6.0803;
        if (twos >= 1)
          return 6.0802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 6.0706;
        if (fives >= 1)
          return 6.0705;
        if (fours >= 1)
          return 6.0704;
        if (threes >= 1)
          return 6.0703;
        if (twos >= 1)
          return 6.0702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 6.0605;
        if (fours >= 1)
          return 6.0604;
        if (threes >= 1)
          return 6.0603;
        if (twos >= 1)
          return 6.0602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 6.0504;
        if (threes >= 1)
          return 6.0503;
        if (twos >= 1)
          return 6.0502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 6.0403;
        if (twos >= 1)
          return 6.0402;
      } // if end
      if (threes >= 1) {
        if (twos >= 1)
          return 6.0302;
      } // if end
      if (twos >= 1)
        return 6.0200;
    } // if end

    if (aces == 1 && kings == 1 && queens == 1 && jacks == 1 && tens == 1)
      return 5.14;
    if (kings == 1 && queens == 1 && jacks == 1 && tens == 1 && nines == 1)
      return 5.13;
    if (queens == 1 && jacks == 1 && tens == 1 && nines == 1 && eights == 1)
      return 5.12;
    if (jacks == 1 && tens == 1 && nines == 1 && eights == 1 && sevens == 1)
      return 5.11;
    if (tens == 1 && nines == 1 && eights == 1 && sevens == 1 && sixes == 1)
      return 5.10;
    if (nines == 1 && eights == 1 && sevens == 1 && sixes == 1 && fives == 1)
      return 5.09;
    if (eights == 1 && sevens == 1 && sixes == 1 && fives == 1 && fours == 1)
      return 5.08;
    if (sevens == 1 && sixes == 1 && fives == 1 && fours == 1 && threes == 1)
      return 5.07;
    if (sixes == 1 && fives == 1 && fours == 1 && threes == 1 && twos == 1)
      return 5.06;
    if (fives == 1 && fours == 1 && threes == 1 && twos == 1 && aces == 1)
      return 5.05;

    if (aces == 3) {
      if (kings >= 1) {
        if (queens >= 1)
          return 4.141312;
        if (jacks >= 1)
          return 4.141311;
        if (tens >= 1)
          return 4.141310;
        if (nines >= 1)
          return 4.141309;
        if (eights >= 1)
          return 4.141308;
        if (sevens >= 1)
          return 4.141307;
        if (sixes >= 1)
          return 4.141306;
        if (fives >= 1)
          return 4.141305;
        if (fours >= 1)
          return 4.141304;
        if (threes >= 1)
          return 4.141303;
        if (twos >= 1)
          return 4.141302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.141211;
        if (tens >= 1)
          return 4.141210;
        if (nines >= 1)
          return 4.141209;
        if (eights >= 1)
          return 4.141208;
        if (sevens >= 1)
          return 4.141207;
        if (sixes >= 1)
          return 4.141206;
        if (fives >= 1)
          return 4.141205;
        if (fours >= 1)
          return 4.141204;
        if (threes >= 1)
          return 4.141203;
        if (twos >= 1)
          return 4.141202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.141110;
        if (nines >= 1)
          return 4.141109;
        if (eights >= 1)
          return 4.141108;
        if (sevens >= 1)
          return 4.141107;
        if (sixes >= 1)
          return 4.141106;
        if (fives >= 1)
          return 4.141105;
        if (fours >= 1)
          return 4.141104;
        if (threes >= 1)
          return 4.141103;
        if (twos >= 1)
          return 4.141102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.141009;
        if (eights >= 1)
          return 4.141008;
        if (sevens >= 1)
          return 4.141007;
        if (sixes >= 1)
          return 4.141006;
        if (fives >= 1)
          return 4.141005;
        if (fours >= 1)
          return 4.141004;
        if (threes >= 1)
          return 4.141003;
        if (twos >= 1)
          return 4.141002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.140908;
        if (sevens >= 1)
          return 4.140907;
        if (sixes >= 1)
          return 4.140906;
        if (fives >= 1)
          return 4.140905;
        if (fours >= 1)
          return 4.140904;
        if (threes >= 1)
          return 4.140903;
        if (twos >= 1)
          return 4.140902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.140807;
        if (sixes >= 1)
          return 4.140806;
        if (fives >= 1)
          return 4.140805;
        if (fours >= 1)
          return 4.140804;
        if (threes >= 1)
          return 4.140803;
        if (twos >= 1)
          return 4.140802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.140706;
        if (fives >= 1)
          return 4.140705;
        if (fours >= 1)
          return 4.140704;
        if (threes >= 1)
          return 4.140703;
        if (twos >= 1)
          return 4.140702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.140605;
        if (fours >= 1)
          return 4.140604;
        if (threes >= 1)
          return 4.140603;
        if (twos >= 1)
          return 4.140602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.140504;
        if (threes >= 1)
          return 4.140503;
        if (twos >= 1)
          return 4.140502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.140403;
        if (twos >= 1)
          return 4.140402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.140302;
    } // if end
    if (kings == 3) {
      if (aces >= 1) {
        if (queens >= 1)
          return 4.131412;
        if (jacks >= 1)
          return 4.131411;
        if (tens >= 1)
          return 4.131410;
        if (nines >= 1)
          return 4.131409;
        if (eights >= 1)
          return 4.131408;
        if (sevens >= 1)
          return 4.131407;
        if (sixes >= 1)
          return 4.131406;
        if (fives >= 1)
          return 4.131405;
        if (fours >= 1)
          return 4.131404;
        if (threes >= 1)
          return 4.131403;
        if (twos >= 1)
          return 4.131402;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.131211;
        if (tens >= 1)
          return 4.131210;
        if (nines >= 1)
          return 4.131209;
        if (eights >= 1)
          return 4.131208;
        if (sevens >= 1)
          return 4.131207;
        if (sixes >= 1)
          return 4.131206;
        if (fives >= 1)
          return 4.131205;
        if (fours >= 1)
          return 4.131204;
        if (threes >= 1)
          return 4.131203;
        if (twos >= 1)
          return 4.131202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.131110;
        if (nines >= 1)
          return 4.131109;
        if (eights >= 1)
          return 4.131108;
        if (sevens >= 1)
          return 4.131107;
        if (sixes >= 1)
          return 4.131106;
        if (fives >= 1)
          return 4.131105;
        if (fours >= 1)
          return 4.131104;
        if (threes >= 1)
          return 4.131103;
        if (twos >= 1)
          return 4.131102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.131009;
        if (eights >= 1)
          return 4.131008;
        if (sevens >= 1)
          return 4.131007;
        if (sixes >= 1)
          return 4.131006;
        if (fives >= 1)
          return 4.131005;
        if (fours >= 1)
          return 4.131004;
        if (threes >= 1)
          return 4.131003;
        if (twos >= 1)
          return 4.131002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.130908;
        if (sevens >= 1)
          return 4.130907;
        if (sixes >= 1)
          return 4.130906;
        if (fives >= 1)
          return 4.130905;
        if (fours >= 1)
          return 4.130904;
        if (threes >= 1)
          return 4.130903;
        if (twos >= 1)
          return 4.130902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.130807;
        if (sixes >= 1)
          return 4.130806;
        if (fives >= 1)
          return 4.130805;
        if (fours >= 1)
          return 4.130804;
        if (threes >= 1)
          return 4.130803;
        if (twos >= 1)
          return 4.130802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.130706;
        if (fives >= 1)
          return 4.130705;
        if (fours >= 1)
          return 4.130704;
        if (threes >= 1)
          return 4.130703;
        if (twos >= 1)
          return 4.130702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.130605;
        if (fours >= 1)
          return 4.130604;
        if (threes >= 1)
          return 4.130603;
        if (twos >= 1)
          return 4.130602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.130504;
        if (threes >= 1)
          return 4.130503;
        if (twos >= 1)
          return 4.130502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.130403;
        if (twos >= 1)
          return 4.130402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.130302;
    } // if end
    if (queens == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.121413;
        if (jacks >= 1)
          return 4.121411;
        if (tens >= 1)
          return 4.121410;
        if (nines >= 1)
          return 4.121409;
        if (eights >= 1)
          return 4.121408;
        if (sevens >= 1)
          return 4.121407;
        if (sixes >= 1)
          return 4.121406;
        if (fives >= 1)
          return 4.121405;
        if (fours >= 1)
          return 4.121404;
        if (threes >= 1)
          return 4.121403;
        if (twos >= 1)
          return 4.121402;
      } // if end
      if (kings >= 1) {
        if (jacks >= 1)
          return 4.121311;
        if (tens >= 1)
          return 4.121310;
        if (nines >= 1)
          return 4.121309;
        if (eights >= 1)
          return 4.121308;
        if (sevens >= 1)
          return 4.121307;
        if (sixes >= 1)
          return 4.121306;
        if (fives >= 1)
          return 4.121305;
        if (fours >= 1)
          return 4.121304;
        if (threes >= 1)
          return 4.121303;
        if (twos >= 1)
          return 4.121302;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.121110;
        if (nines >= 1)
          return 4.121109;
        if (eights >= 1)
          return 4.121108;
        if (sevens >= 1)
          return 4.121107;
        if (sixes >= 1)
          return 4.121106;
        if (fives >= 1)
          return 4.121105;
        if (fours >= 1)
          return 4.121104;
        if (threes >= 1)
          return 4.121103;
        if (twos >= 1)
          return 4.121102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.121009;
        if (eights >= 1)
          return 4.121008;
        if (sevens >= 1)
          return 4.121007;
        if (sixes >= 1)
          return 4.121006;
        if (fives >= 1)
          return 4.121005;
        if (fours >= 1)
          return 4.121004;
        if (threes >= 1)
          return 4.121003;
        if (twos >= 1)
          return 4.121002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.120908;
        if (sevens >= 1)
          return 4.120907;
        if (sixes >= 1)
          return 4.120906;
        if (fives >= 1)
          return 4.120905;
        if (fours >= 1)
          return 4.120904;
        if (threes >= 1)
          return 4.120903;
        if (twos >= 1)
          return 4.120902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.120807;
        if (sixes >= 1)
          return 4.120806;
        if (fives >= 1)
          return 4.120805;
        if (fours >= 1)
          return 4.120804;
        if (threes >= 1)
          return 4.120803;
        if (twos >= 1)
          return 4.120802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.120706;
        if (fives >= 1)
          return 4.120705;
        if (fours >= 1)
          return 4.120704;
        if (threes >= 1)
          return 4.120703;
        if (twos >= 1)
          return 4.120702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.120605;
        if (fours >= 1)
          return 4.120604;
        if (threes >= 1)
          return 4.120603;
        if (twos >= 1)
          return 4.120602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.120504;
        if (threes >= 1)
          return 4.120503;
        if (twos >= 1)
          return 4.120502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.120403;
        if (twos >= 1)
          return 4.120402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.120302;
    } // if end
    if (jacks == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.111413;
        if (queens >= 1)
          return 4.111412;
        if (tens >= 1)
          return 4.111410;
        if (nines >= 1)
          return 4.111409;
        if (eights >= 1)
          return 4.111408;
        if (sevens >= 1)
          return 4.111407;
        if (sixes >= 1)
          return 4.111406;
        if (fives >= 1)
          return 4.111405;
        if (fours >= 1)
          return 4.111404;
        if (threes >= 1)
          return 4.111403;
        if (twos >= 1)
          return 4.111402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.111312;
        if (tens >= 1)
          return 4.111310;
        if (nines >= 1)
          return 4.111309;
        if (eights >= 1)
          return 4.111308;
        if (sevens >= 1)
          return 4.111307;
        if (sixes >= 1)
          return 4.111306;
        if (fives >= 1)
          return 4.111305;
        if (fours >= 1)
          return 4.111304;
        if (threes >= 1)
          return 4.111303;
        if (twos >= 1)
          return 4.111302;
      } // if end
      if (queens >= 1) {
        if (tens >= 1)
          return 4.111210;
        if (nines >= 1)
          return 4.111209;
        if (eights >= 1)
          return 4.111208;
        if (sevens >= 1)
          return 4.111207;
        if (sixes >= 1)
          return 4.111206;
        if (fives >= 1)
          return 4.111205;
        if (fours >= 1)
          return 4.111204;
        if (threes >= 1)
          return 4.111203;
        if (twos >= 1)
          return 4.111202;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.111009;
        if (eights >= 1)
          return 4.111008;
        if (sevens >= 1)
          return 4.111007;
        if (sixes >= 1)
          return 4.111006;
        if (fives >= 1)
          return 4.111005;
        if (fours >= 1)
          return 4.111004;
        if (threes >= 1)
          return 4.111003;
        if (twos >= 1)
          return 4.111002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.110908;
        if (sevens >= 1)
          return 4.110907;
        if (sixes >= 1)
          return 4.110906;
        if (fives >= 1)
          return 4.110905;
        if (fours >= 1)
          return 4.110904;
        if (threes >= 1)
          return 4.110903;
        if (twos >= 1)
          return 4.110902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.110807;
        if (sixes >= 1)
          return 4.110806;
        if (fives >= 1)
          return 4.110805;
        if (fours >= 1)
          return 4.110804;
        if (threes >= 1)
          return 4.110803;
        if (twos >= 1)
          return 4.110802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.110706;
        if (fives >= 1)
          return 4.110705;
        if (fours >= 1)
          return 4.110704;
        if (threes >= 1)
          return 4.110703;
        if (twos >= 1)
          return 4.110702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.110605;
        if (fours >= 1)
          return 4.110604;
        if (threes >= 1)
          return 4.110603;
        if (twos >= 1)
          return 4.110602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.110504;
        if (threes >= 1)
          return 4.110503;
        if (twos >= 1)
          return 4.110502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.110403;
        if (twos >= 1)
          return 4.110402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.110302;
    } // if end
    if (tens == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.101413;
        if (queens >= 1)
          return 4.101412;
        if (jacks >= 1)
          return 4.101411;
        if (nines >= 1)
          return 4.101409;
        if (eights >= 1)
          return 4.101408;
        if (sevens >= 1)
          return 4.101407;
        if (sixes >= 1)
          return 4.101406;
        if (fives >= 1)
          return 4.101405;
        if (fours >= 1)
          return 4.101404;
        if (threes >= 1)
          return 4.101403;
        if (twos >= 1)
          return 4.101402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.101312;
        if (jacks >= 1)
          return 4.101311;
        if (nines >= 1)
          return 4.101309;
        if (eights >= 1)
          return 4.101308;
        if (sevens >= 1)
          return 4.101307;
        if (sixes >= 1)
          return 4.101306;
        if (fives >= 1)
          return 4.101305;
        if (fours >= 1)
          return 4.101304;
        if (threes >= 1)
          return 4.101303;
        if (twos >= 1)
          return 4.101302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.101211;
        if (nines >= 1)
          return 4.101209;
        if (eights >= 1)
          return 4.101208;
        if (sevens >= 1)
          return 4.101207;
        if (sixes >= 1)
          return 4.101206;
        if (fives >= 1)
          return 4.101205;
        if (fours >= 1)
          return 4.101204;
        if (threes >= 1)
          return 4.101203;
        if (twos >= 1)
          return 4.101202;
      } // if end
      if (jacks >= 1) {
        if (nines >= 1)
          return 4.101109;
        if (eights >= 1)
          return 4.101108;
        if (sevens >= 1)
          return 4.101107;
        if (sixes >= 1)
          return 4.101106;
        if (fives >= 1)
          return 4.101105;
        if (fours >= 1)
          return 4.101104;
        if (threes >= 1)
          return 4.101103;
        if (twos >= 1)
          return 4.101102;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.100908;
        if (sevens >= 1)
          return 4.100907;
        if (sixes >= 1)
          return 4.100906;
        if (fives >= 1)
          return 4.100905;
        if (fours >= 1)
          return 4.100904;
        if (threes >= 1)
          return 4.100903;
        if (twos >= 1)
          return 4.100902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.100807;
        if (sixes >= 1)
          return 4.100806;
        if (fives >= 1)
          return 4.100805;
        if (fours >= 1)
          return 4.100804;
        if (threes >= 1)
          return 4.100803;
        if (twos >= 1)
          return 4.100802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.100706;
        if (fives >= 1)
          return 4.100705;
        if (fours >= 1)
          return 4.100704;
        if (threes >= 1)
          return 4.100703;
        if (twos >= 1)
          return 4.100702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.100605;
        if (fours >= 1)
          return 4.100604;
        if (threes >= 1)
          return 4.100603;
        if (twos >= 1)
          return 4.100602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.100504;
        if (threes >= 1)
          return 4.100503;
        if (twos >= 1)
          return 4.100502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.100403;
        if (twos >= 1)
          return 4.100402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.100302;
    } // if end
    if (nines == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.091413;
        if (queens >= 1)
          return 4.091412;
        if (jacks >= 1)
          return 4.091411;
        if (tens >= 1)
          return 4.091410;
        if (eights >= 1)
          return 4.091408;
        if (sevens >= 1)
          return 4.091407;
        if (sixes >= 1)
          return 4.091406;
        if (fives >= 1)
          return 4.091405;
        if (fours >= 1)
          return 4.091404;
        if (threes >= 1)
          return 4.091403;
        if (twos >= 1)
          return 4.091402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.091312;
        if (jacks >= 1)
          return 4.091311;
        if (tens >= 1)
          return 4.091310;
        if (eights >= 1)
          return 4.091308;
        if (sevens >= 1)
          return 4.091307;
        if (sixes >= 1)
          return 4.091306;
        if (fives >= 1)
          return 4.091305;
        if (fours >= 1)
          return 4.091304;
        if (threes >= 1)
          return 4.091303;
        if (twos >= 1)
          return 4.091302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.091211;
        if (tens >= 1)
          return 4.091210;
        if (eights >= 1)
          return 4.091208;
        if (sevens >= 1)
          return 4.091207;
        if (sixes >= 1)
          return 4.091206;
        if (fives >= 1)
          return 4.091205;
        if (fours >= 1)
          return 4.091204;
        if (threes >= 1)
          return 4.091203;
        if (twos >= 1)
          return 4.091202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.091110;
        if (eights >= 1)
          return 4.091108;
        if (sevens >= 1)
          return 4.091107;
        if (sixes >= 1)
          return 4.091106;
        if (fives >= 1)
          return 4.091105;
        if (fours >= 1)
          return 4.091104;
        if (threes >= 1)
          return 4.091103;
        if (twos >= 1)
          return 4.091102;
      } // if end
      if (tens >= 1) {
        if (eights >= 1)
          return 4.091008;
        if (sevens >= 1)
          return 4.091007;
        if (sixes >= 1)
          return 4.091006;
        if (fives >= 1)
          return 4.091005;
        if (fours >= 1)
          return 4.091004;
        if (threes >= 1)
          return 4.091003;
        if (twos >= 1)
          return 4.091002;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.090807;
        if (sixes >= 1)
          return 4.090806;
        if (fives >= 1)
          return 4.090805;
        if (fours >= 1)
          return 4.090804;
        if (threes >= 1)
          return 4.090803;
        if (twos >= 1)
          return 4.090802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.090706;
        if (fives >= 1)
          return 4.090705;
        if (fours >= 1)
          return 4.090704;
        if (threes >= 1)
          return 4.090703;
        if (twos >= 1)
          return 4.090702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.090605;
        if (fours >= 1)
          return 4.090604;
        if (threes >= 1)
          return 4.090603;
        if (twos >= 1)
          return 4.090602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.090504;
        if (threes >= 1)
          return 4.090503;
        if (twos >= 1)
          return 4.090502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.090403;
        if (twos >= 1)
          return 4.090402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.090302;
    } // if end
    if (eights == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.081413;
        if (queens >= 1)
          return 4.081412;
        if (jacks >= 1)
          return 4.081411;
        if (tens >= 1)
          return 4.081410;
        if (nines >= 1)
          return 4.081409;
        if (sevens >= 1)
          return 4.081407;
        if (sixes >= 1)
          return 4.081406;
        if (fives >= 1)
          return 4.081405;
        if (fours >= 1)
          return 4.081404;
        if (threes >= 1)
          return 4.081403;
        if (twos >= 1)
          return 4.081402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.081312;
        if (jacks >= 1)
          return 4.081311;
        if (tens >= 1)
          return 4.081310;
        if (nines >= 1)
          return 4.081309;
        if (sevens >= 1)
          return 4.081307;
        if (sixes >= 1)
          return 4.081306;
        if (fives >= 1)
          return 4.081305;
        if (fours >= 1)
          return 4.081304;
        if (threes >= 1)
          return 4.081303;
        if (twos >= 1)
          return 4.081302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.081211;
        if (tens >= 1)
          return 4.081210;
        if (nines >= 1)
          return 4.081209;
        if (sevens >= 1)
          return 4.081207;
        if (sixes >= 1)
          return 4.081206;
        if (fives >= 1)
          return 4.081205;
        if (fours >= 1)
          return 4.081204;
        if (threes >= 1)
          return 4.081203;
        if (twos >= 1)
          return 4.081202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.081110;
        if (nines >= 1)
          return 4.081109;
        if (sevens >= 1)
          return 4.081107;
        if (sixes >= 1)
          return 4.081106;
        if (fives >= 1)
          return 4.081105;
        if (fours >= 1)
          return 4.081104;
        if (threes >= 1)
          return 4.081103;
        if (twos >= 1)
          return 4.081102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1) 
          return 4.081009;
        if (sevens >= 1)
          return 4.081007;
        if (sixes >= 1)
          return 4.081006;
        if (fives >= 1)
          return 4.081005;
        if (fours >= 1)
          return 4.081004;
        if (threes >= 1)
          return 4.081003;
        if (twos >= 1)
          return 4.081002;
      } // if end
      if (nines >= 1) {
        if (sevens >= 1)
          return 4.080907;
        if (sixes >= 1)
          return 4.080906;
        if (fives >= 1)
          return 4.080905;
        if (fours >= 1)
          return 4.080904;
        if (threes >= 1)
          return 4.080903;
        if (twos >= 1)
          return 4.080902;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.080706;
        if (fives >= 1)
          return 4.080705;
        if (fours >= 1)
          return 4.080704;
        if (threes >= 1)
          return 4.080703;
        if (twos >= 1)
          return 4.080702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.080605;
        if (fours >= 1)
          return 4.080604;
        if (threes >= 1)
          return 4.080603;
        if (twos >= 1)
          return 4.080602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.080504;
        if (threes >= 1)
          return 4.080503;
        if (twos >= 1)
          return 4.080502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.080403;
        if (twos >= 1)
          return 4.080402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.080302;
    } // if end
    if (sevens == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.071413;
        if (queens >= 1)
          return 4.071412;
        if (jacks >= 1)
          return 4.071411;
        if (tens >= 1)
          return 4.071410;
        if (nines >= 1)
          return 4.071409;
        if (eights >= 1)
          return 4.071408;
        if (sixes >= 1)
          return 4.071406;
        if (fives >= 1)
          return 4.071405;
        if (fours >= 1)
          return 4.071404;
        if (threes >= 1)
          return 4.071403;
        if (twos >= 1)
          return 4.071402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.071312;
        if (jacks >= 1)
          return 4.071311;
        if (tens >= 1)
          return 4.071310;
        if (nines >= 1)
          return 4.071309;
        if (eights >= 1)
          return 4.071308;
        if (sixes >= 1)
          return 4.071306;
        if (fives >= 1)
          return 4.071305;
        if (fours >= 1)
          return 4.071304;
        if (threes >= 1)
          return 4.071303;
        if (twos >= 1)
          return 4.071302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.071211;
        if (tens >= 1)
          return 4.071210;
        if (nines >= 1)
          return 4.071209;
        if (eights >= 1)
          return 4.071208;
        if (sixes >= 1)
          return 4.071206;
        if (fives >= 1)
          return 4.071205;
        if (fours >= 1)
          return 4.071204;
        if (threes >= 1)
          return 4.071203;
        if (twos >= 1)
          return 4.071202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.071110;
        if (nines >= 1)
          return 4.071109;
        if (eights >= 1)
          return 4.071108;
        if (sixes >= 1)
          return 4.071106;
        if (fives >= 1)
          return 4.071105;
        if (fours >= 1)
          return 4.071104;
        if (threes >= 1)
          return 4.071103;
        if (twos >= 1)
          return 4.071102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.071009;
        if (eights >= 1)
          return 4.071008;
        if (sixes >= 1)
          return 4.071006;
        if (fives >= 1)
          return 4.071005;
        if (fours >= 1)
          return 4.071004;
        if (threes >= 1)
          return 4.071003;
        if (twos >= 1)
          return 4.071002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.070908;
        if (sixes >= 1)
          return 4.070906;
        if (fives >= 1)
          return 4.070905;
        if (fours >= 1)
          return 4.070904;
        if (threes >= 1)
          return 4.070903;
        if (twos >= 1)
          return 4.070902;
      } // if end
      if (eights >= 1) {
        if (sixes >= 1)
          return 4.070806;
        if (fives >= 1)
          return 4.070805;
        if (fours >= 1)
          return 4.070804;
        if (threes >= 1)
          return 4.070803;
        if (twos >= 1)
          return 4.070802;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.070605;
        if (fours >= 1)
          return 4.070604;
        if (threes >= 1)
          return 4.070603;
        if (twos >= 1)
          return 4.070602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.070504;
        if (threes >= 1)
          return 4.070503;
        if (twos >= 1)
          return 4.070502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.070403;
        if (twos >= 1)
          return 4.070402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.070302;
    } // if end
    if (sixes == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.061413;
        if (queens >= 1)
          return 4.061412;
        if (jacks >= 1)
          return 4.061411;
        if (tens >= 1)
          return 4.061410;
        if (nines >= 1)
          return 4.061409;
        if (eights >= 1)
          return 4.061408;
        if (sevens >= 1)
          return 4.061407;
        if (fives >= 1)
          return 4.061405;
        if (fours >= 1)
          return 4.061404;
        if (threes >= 1)
          return 4.061403;
        if (twos >= 1)
          return 4.061402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.061312;
        if (jacks >= 1)
          return 4.061311;
        if (tens >= 1)
          return 4.061310;
        if (nines >= 1)
          return 4.061309;
        if (eights >= 1)
          return 4.061308;
        if (sevens >= 1)
          return 4.061307;
        if (fives >= 1)
          return 4.061305;
        if (fours >= 1)
          return 4.061304;
        if (threes >= 1)
          return 4.061303;
        if (twos >= 1)
          return 4.061302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.061211;
        if (tens >= 1)
          return 4.061210;
        if (nines >= 1)
          return 4.061209;
        if (eights >= 1)
          return 4.061208;
        if (sevens >= 1)
          return 4.061207;
        if (fives >= 1)
          return 4.061205;
        if (fours >= 1)
          return 4.061204;
        if (threes >= 1)
          return 4.061203;
        if (twos >= 1)
          return 4.061202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.061110;
        if (nines >= 1)
          return 4.061109;
        if (eights >= 1)
          return 4.061108;
        if (sevens >= 1)
          return 4.061107;
        if (fives >= 1)
          return 4.061105;
        if (fours >= 1)
          return 4.061104;
        if (threes >= 1)
          return 4.061103;
        if (twos >= 1)
          return 4.061102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.061009;
        if (eights >= 1)
          return 4.061008;
        if (sevens >= 1)
          return 4.061007;
        if (fives >= 1)
          return 4.061005;
        if (fours >= 1)
          return 4.061004;
        if (threes >= 1)
          return 4.061003;
        if (twos >= 1)
          return 4.061002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.060908;
        if (sevens >= 1)
          return 4.060907;
        if (fives >= 1)
          return 4.060905;
        if (fours >= 1)
          return 4.060904;
        if (threes >= 1)
          return 4.060903;
        if (twos >= 1)
          return 4.060902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1) 
          return 4.060807;
        if (fives >= 1)
          return 4.060805;
        if (fours >= 1)
          return 4.060804;
        if (threes >= 1)
          return 4.060803;
        if (twos >= 1)
          return 4.060802;
      } // if end
      if (sevens >= 1) {
        if (fives >= 1)
          return 4.060705;
        if (fours >= 1)
          return 4.060704;
        if (threes >= 1)
          return 4.060703;
        if (twos >= 1)
          return 4.060702;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.060504;
        if (threes >= 1)
          return 4.060503;
        if (twos >= 1)
          return 4.060502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.060403;
        if (twos >= 1)
          return 4.060402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.060302;
    } // if end
    if (fives == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.051413;
        if (queens >= 1)
          return 4.051412;
        if (jacks >= 1)
          return 4.051411;
        if (tens >= 1)
          return 4.051410;
        if (nines >= 1)
          return 4.051409;
        if (eights >= 1)
          return 4.051408;
        if (sevens >= 1)
          return 4.051407;
        if (sixes >= 1)
          return 4.051406;
        if (fours >= 1)
          return 4.051404;
        if (threes >= 1)
          return 4.051403;
        if (twos >= 1)
          return 4.051402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.051312;
        if (jacks >= 1)
          return 4.051311;
        if (tens >= 1)
          return 4.051310;
        if (nines >= 1)
          return 4.051309;
        if (eights >= 1)
          return 4.051308;
        if (sevens >= 1)
          return 4.051307;
        if (sixes >= 1)
          return 4.051306;
        if (fours >= 1)
          return 4.051304;
        if (threes >= 1)
          return 4.051303;
        if (twos >= 1)
          return 4.051302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.051211;
        if (tens >= 1)
          return 4.051210;
        if (nines >= 1)
          return 4.051209;
        if (eights >= 1)
          return 4.051208;
        if (sevens >= 1)
          return 4.051207;
        if (sixes >= 1)
          return 4.051206;
        if (fours >= 1)
          return 4.051204;
        if (threes >= 1)
          return 4.051203;
        if (twos >= 1)
          return 4.051202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.051110;
        if (nines >= 1)
          return 4.051109;
        if (eights >= 1)
          return 4.051108;
        if (sevens >= 1)
          return 4.051107;
        if (sixes >= 1)
          return 4.051106;
        if (fours >= 1)
          return 4.051104;
        if (threes >= 1)
          return 4.051103;
        if (twos >= 1)
          return 4.051102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.051009;
        if (eights >= 1)
          return 4.051008;
        if (sevens >= 1)
          return 4.051007;
        if (sixes >= 1)
          return 4.051006;
        if (fours >= 1)
          return 4.051004;
        if (threes >= 1)
          return 4.051003;
        if (twos >= 1)
          return 4.051002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.050908;
        if (sevens >= 1)
          return 4.050907;
        if (sixes >= 1)
          return 4.050906;
        if (fours >= 1)
          return 4.050904;
        if (threes >= 1)
          return 4.050903;
        if (twos >= 1)
          return 4.050902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.050807;
        if (sixes >= 1)
          return 4.050806;
        if (fours >= 1)
          return 4.050804;
        if (threes >= 1)
          return 4.050803;
        if (twos >= 1)
          return 4.050802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.050706;
        if (fours >= 1)
          return 4.050704;
        if (threes >= 1)
          return 4.050703;
        if (twos >= 1)
          return 4.050702;
      } // if end
      if (sixes >= 1) {
        if (fours >= 1)
          return 4.050604;
        if (threes >= 1)
          return 4.050603;
        if (twos >= 1)
          return 4.050602;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 4.050403;
        if (twos >= 1)
          return 4.050402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.050302;
    } // if end
    if (fours == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.041413;
        if (queens >= 1)
          return 4.041412;
        if (jacks >= 1)
          return 4.041411;
        if (tens >= 1)
          return 4.041410;
        if (nines >= 1)
          return 4.041409;
        if (eights >= 1)
          return 4.041408;
        if (sevens >= 1)
          return 4.041407;
        if (sixes >= 1)
          return 4.041406;
        if (fives >= 1)
          return 4.041405;
        if (threes >= 1)
          return 4.041403;
        if (twos >= 1)
          return 4.041402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.041312;
        if (jacks >= 1)
          return 4.041311;
        if (tens >= 1)
          return 4.041310;
        if (nines >= 1)
          return 4.041309;
        if (eights >= 1)
          return 4.041308;
        if (sevens >= 1)
          return 4.041307;
        if (sixes >= 1)
          return 4.041306;
        if (fives >= 1)
          return 4.041305;
        if (threes >= 1)
          return 4.041303;
        if (twos >= 1)
          return 4.041302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.041211;
        if (tens >= 1)
          return 4.041210;
        if (nines >= 1)
          return 4.041209;
        if (eights >= 1)
          return 4.041208;
        if (sevens >= 1)
          return 4.041207;
        if (sixes >= 1)
          return 4.041206;
        if (fives >= 1)
          return 4.041205;
        if (threes >= 1)
          return 4.041203;
        if (twos >= 1)
          return 4.041202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.041110;
        if (nines >= 1)
          return 4.041109;
        if (eights >= 1)
          return 4.041108;
        if (sevens >= 1)
          return 4.041107;
        if (sixes >= 1)
          return 4.041106;
        if (fives >= 1)
          return 4.041105;
        if (threes >= 1)
          return 4.041103;
        if (twos >= 1)
          return 4.041102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.041009;
        if (eights >= 1)
          return 4.041008;
        if (sevens >= 1)
          return 4.041007;
        if (sixes >= 1)
          return 4.041006;
        if (fives >= 1)
          return 4.041005;
        if (threes >= 1)
          return 4.041003;
        if (twos >= 1)
          return 4.041002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.040908;
        if (sevens >= 1)
          return 4.040907;
        if (sixes >= 1)
          return 4.040906;
        if (fives >= 1)
          return 4.040905;
        if (threes >= 1)
          return 4.040903;
        if (twos >= 1)
          return 4.040902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.040807;
        if (sixes >= 1)
          return 4.040806;
        if (fives >= 1)
          return 4.040805;
        if (threes >= 1)
          return 4.040803;
        if (twos >= 1)
          return 4.040802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.040706;
        if (fives >= 1)
          return 4.040705;
        if (threes >= 1)
          return 4.040703;
        if (twos >= 1)
          return 4.040702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.040605;
        if (threes >= 1)
          return 4.040603;
        if (twos >= 1)
          return 4.040602;
      } // if end
      if (fives >= 1) {
        if (threes >= 1)
          return 4.040503;
        if (twos >= 1)
          return 4.040502;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 4.040302;
    } // if end
    if (threes == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.031413;
        if (queens >= 1)
          return 4.031412;
        if (jacks >= 1)
          return 4.031411;
        if (tens >= 1)
          return 4.031410;
        if (nines >= 1)
          return 4.031409;
        if (eights >= 1)
          return 4.031408;
        if (sevens >= 1)
          return 4.031407;
        if (sixes >= 1)
          return 4.031406;
        if (fives >= 1)
          return 4.031405;
        if (fours >= 1)
          return 4.031404;
        if (twos >= 1)
          return 4.031402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.031312;
        if (jacks >= 1)
          return 4.031311;
        if (tens >= 1)
          return 4.031310;
        if (nines >= 1)
          return 4.031309;
        if (eights >= 1)
          return 4.031308;
        if (sevens >= 1)
          return 4.031307;
        if (sixes >= 1)
          return 4.031306;
        if (fives >= 1)
          return 4.031305;
        if (fours >= 1)
          return 4.031304;
        if (twos >= 1)
          return 4.031302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.031211;
        if (tens >= 1)
          return 4.031210;
        if (nines >= 1)
          return 4.031209;
        if (eights >= 1)
          return 4.031208;
        if (sevens >= 1)
          return 4.031207;
        if (sixes >= 1)
          return 4.031206;
        if (fives >= 1)
          return 4.031205;
        if (fours >= 1)
          return 4.031204;
        if (twos >= 1)
          return 4.031202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.031110;
        if (nines >= 1)
          return 4.031109;
        if (eights >= 1)
          return 4.031108;
        if (sevens >= 1)
          return 4.031107;
        if (sixes >= 1)
          return 4.031106;
        if (fives >= 1)
          return 4.031105;
        if (fours >= 1)
          return 4.031104;
        if (twos >= 1)
          return 4.031102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1) 
          return 4.031009;
        if (eights >= 1)
          return 4.031008;
        if (sevens >= 1)
          return 4.031007;
        if (sixes >= 1)
          return 4.031006;
        if (fives >= 1)
          return 4.031005;
        if (fours >= 1)
          return 4.031004;
        if (twos >= 1)
          return 4.031002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.030908;
        if (sevens >= 1)
          return 4.030907;
        if (sixes >= 1)
          return 4.030906;
        if (fives >= 1)
          return 4.030905;
        if (fours >= 1)
          return 4.030904;
        if (twos >= 1)
          return 4.030902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.030807;
        if (sixes >= 1)
          return 4.030806;
        if (fives >= 1)
          return 4.030805;
        if (fours >= 1)
          return 4.030804;
        if (twos >= 1)
          return 4.030802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.030706;
        if (fives >= 1)
          return 4.030705;
        if (fours >= 1)
          return 4.030704;
        if (twos >= 1)
          return 4.030702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.030605;
        if (fours >= 1)
          return 4.030604;
        if (twos >= 1)
          return 4.030602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.030504;
        if (twos >= 1)
          return 4.030502;
      } // if end
      if (fours >= 1)
        if (twos >= 1)
          return 4.030402;
    } // if end
    if (twos == 3) {
      if (aces >= 1) {
        if (kings >= 1)
          return 4.021413;
        if (queens >= 1)
          return 4.021412;
        if (jacks >= 1)
          return 4.021411;
        if (tens >= 1)
          return 4.021410;
        if (nines >= 1)
          return 4.021409;
        if (eights >= 1)
          return 4.021408;
        if (sevens >= 1)
          return 4.021407;
        if (sixes >= 1)
          return 4.021406;
        if (fives >= 1)
          return 4.021405;
        if (fours >= 1)
          return 4.021404;
        if (threes >= 1)
          return 4.021403;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 4.021312;
        if (jacks >= 1)
          return 4.021311;
        if (tens >= 1)
          return 4.021310;
        if (nines >= 1)
          return 4.021309;
        if (eights >= 1)
          return 4.021308;
        if (sevens >= 1)
          return 4.021307;
        if (sixes >= 1)
          return 4.021306;
        if (fives >= 1)
          return 4.021305;
        if (fours >= 1)
          return 4.021304;
        if (threes >= 1)
          return 4.021303;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 4.021211;
        if (tens >= 1)
          return 4.021210;
        if (nines >= 1)
          return 4.021209;
        if (eights >= 1)
          return 4.021208;
        if (sevens >= 1)
          return 4.021207;
        if (sixes >= 1)
          return 4.021206;
        if (fives >= 1)
          return 4.021205;
        if (fours >= 1)
          return 4.021204;
        if (threes >= 1)
          return 4.021203;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 4.021110;
        if (nines >= 1)
          return 4.021109;
        if (eights >= 1)
          return 4.021108;
        if (sevens >= 1)
          return 4.021107;
        if (sixes >= 1)
          return 4.021106;
        if (fives >= 1)
          return 4.021105;
        if (fours >= 1)
          return 4.021104;
        if (threes >= 1)
          return 4.021103;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 4.021009;
        if (eights >= 1)
          return 4.021008;
        if (sevens >= 1)
          return 4.021007;
        if (sixes >= 1)
          return 4.021006;
        if (fives >= 1)
          return 4.021005;
        if (fours >= 1)
          return 4.021004;
        if (threes >= 1)
          return 4.021003;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 4.020908;
        if (sevens >= 1)
          return 4.020907;
        if (sixes >= 1)
          return 4.020906;
        if (fives >= 1)
          return 4.020905;
        if (fours >= 1)
          return 4.020904;
        if (threes >= 1)
          return 4.020903;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 4.020807;
        if (sixes >= 1)
          return 4.020806;
        if (fives >= 1)
          return 4.020805;
        if (fours >= 1)
          return 4.020804;
        if (threes >= 1)
          return 4.020803;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 4.020706;
        if (fives >= 1)
          return 4.020705;
        if (fours >= 1)
          return 4.020704;
        if (threes >= 1)
          return 4.020703;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 4.020605;
        if (fours >= 1)
          return 4.020604;
        if (threes >= 1)
          return 4.020603;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 4.020504;
        if (threes >= 1)
          return 4.020503;
      } // if end
      if (fours >= 1)
        if (threes >= 1)
          return 4.020403;
    } // if end
    
    if (aces == 2) {
      if (kings == 2) {
        if (queens == 1)
          return 3.141312;
        if (jacks == 1)
          return 3.141311;
        if (tens == 1)
          return 3.141310;
        if (nines == 1)
          return 3.141309;
        if (eights == 1)
          return 3.141308;
        if (sevens == 1)
          return 3.141307;
        if (sixes == 1)
          return 3.141306;
        if (fives == 1)
          return 3.141305;
        if (fours == 1)
          return 3.141304;
        if (threes == 1)
          return 3.141303;
        if (twos == 1)
          return 3.141302;
      } // if end
      if (queens == 2) {
        if (kings == 1)
          return 3.141213;
        if (jacks == 1)
          return 3.141211;
        if (tens == 1)
          return 3.141210;
        if (nines == 1)
          return 3.141209;
        if (eights == 1)
          return 3.141208;
        if (sevens == 1)
          return 3.141207;
        if (sixes == 1)
          return 3.141206;
        if (fives == 1)
          return 3.141205;
        if (fours == 1)
          return 3.141204;
        if (threes == 1)
          return 3.141203;
        if (twos == 1)
          return 3.141202;
      } // if end
      if (jacks == 2) {
        if (kings == 1)
          return 3.141113;
        if (queens == 1)
          return 3.141112;
        if (tens == 1)
          return 3.141110;
        if (nines == 1)
          return 3.141109;
        if (eights == 1)
          return 3.141108;
        if (sevens == 1)
          return 3.141107;
        if (sixes == 1)
          return 3.141106;
        if (fives == 1)
          return 3.141105;
        if (fours == 1)
          return 3.141104;
        if (threes == 1)
          return 3.141103;
        if (twos == 1)
          return 3.141102;
      } // if end
      if (tens == 2) {
        if (kings == 1)
          return 3.141013;
        if (queens == 1)
          return 3.141012;
        if (jacks == 1)
          return 3.141011;
        if (nines == 1)
          return 3.141009;
        if (eights == 1)
          return 3.141008;
        if (sevens == 1)
          return 3.141007;
        if (sixes == 1)
          return 3.141006;
        if (fives == 1)
          return 3.141005;
        if (fours == 1)
          return 3.141004;
        if (threes == 1)
          return 3.141003;
         if (twos == 1)
          return 3.141002;
      } // if end
      if (nines == 2) {
        if (kings == 1)
          return 3.140913;
        if (queens == 1)
          return 3.140912;
        if (jacks == 1)
          return 3.140911;
        if (tens == 1)
          return 3.140910;
        if (eights == 1)
          return 3.140908;
        if (sevens == 1)
          return 3.140907;
        if (sixes == 1)
          return 3.140906;
        if (fives == 1)
          return 3.140905;
        if (fours == 1)
          return 3.140904;
        if (threes == 1)
          return 3.140903;
        if (twos == 1)
          return 3.140902;
      } // if end
      if (eights == 2) {
        if (kings == 1)
          return 3.140813;
        if (queens == 1)
          return 3.140812;
        if (jacks == 1)
          return 3.140811;
        if (tens == 1)
          return 3.140810;
        if (nines == 1)
          return 3.140809;
        if (sevens == 1)
          return 3.140807;
        if (sixes == 1)
          return 3.140806;
        if (fives == 1)
          return 3.140805;
        if (fours == 1)
          return 3.140804;
        if (threes == 1)
          return 3.140803;
        if (twos == 1)
          return 3.140802;
      } // if end
      if (sevens == 2) {
        if (kings == 1)
          return 3.140713;
        if (queens == 1)
          return 3.140712;
        if (jacks == 1)
          return 3.140711;
        if (tens == 1)
          return 3.140710;
        if (nines == 1)
          return 3.140709;
        if (eights == 1)
          return 3.140708;
        if (sixes == 1)
          return 3.140706;
        if (fives == 1)
          return 3.140705;
        if (fours == 1)
          return 3.140704;
        if (threes == 1)
          return 3.140703;
        if (twos == 1)
          return 3.140702;
      } // if end
      if (sixes == 2) {
        if (kings == 1)
          return 3.140613;
        if (queens == 1)
          return 3.140612;
        if (jacks == 1)
          return 3.140611;
        if (tens == 1)
          return 3.140610;
        if (nines == 1)
          return 3.140609;
        if (eights == 1)
          return 3.140608;
        if (sevens == 1)
          return 3.140607;
        if (fives == 1)
          return 3.140605;
        if (fours == 1)
          return 3.140604;
        if (threes == 1)
          return 3.140603;
        if (twos == 1)
          return 3.140602;
      } // if end
      if (fives == 2) {
        if (kings == 1)
          return 3.140513;
        if (queens == 1)
          return 3.140512;
        if (jacks == 1)
          return 3.140511;
        if (tens == 1)
          return 3.140510;
        if (nines == 1)
          return 3.140509;
        if (eights == 1)
          return 3.140508;
        if (sevens == 1)
          return 3.140507;
        if (sixes == 1)
          return 3.140506;
        if (fours == 1)
          return 3.140504;
        if (threes == 1)
          return 3.140503;
        if (twos == 1)
          return 3.140502;
      } // if end
      if (fours == 2) {
        if (kings == 1)
          return 3.140413;
        if (queens == 1)
          return 3.140412;
        if (jacks == 1)
          return 3.140411;
        if (tens == 1)
          return 3.140410;
        if (nines == 1)
          return 3.140409;
        if (eights == 1)
          return 3.140408;
        if (sevens == 1)
          return 3.140407;
        if (sixes == 1)
          return 3.140406;
        if (fives == 1)
          return 3.140405;
        if (threes == 1)
          return 3.140403;
        if (twos == 1)
          return 3.140402;
      } // if end
      if (threes == 2) {
        if (kings == 1)
          return 3.140313;
        if (queens == 1)
          return 3.140312;
        if (jacks == 1)
          return 3.140311;
        if (tens == 1)
          return 3.140310;
        if (nines == 1)
          return 3.140309;
        if (eights == 1)
          return 3.140308;
        if (sevens == 1)
          return 3.140307;
        if (sixes == 1)
          return 3.140306;
        if (fives == 1)
          return 3.140305;
        if (fours == 1)
          return 3.140304;
        if (twos == 1)
          return 3.140302;
      } // if end
      if (twos == 2) {
        if (kings == 1)
           return 3.140213;
        if (queens == 1)
           return 3.140212;
        if (jacks == 1)
           return 3.140211;
        if (tens == 1)
           return 3.140210;
        if (nines == 1)
           return 3.140209;
        if (eights == 1)
           return 3.140208;
        if (sevens == 1)
           return 3.140207;
        if (sixes == 1)
           return 3.140206;
        if (fives == 1)
           return 3.140205;
        if (fours == 1)
           return 3.140204;
        if (threes == 1)
           return 3.140203;
        } // if end
    } // if end
    if (kings == 2) {
      if (queens == 2) {
        if (aces == 1)
          return 3.131214;
        if (jacks == 1)
          return 3.131211;
        if (tens == 1)
          return 3.131210;
        if (nines == 1)
          return 3.131209;
        if (eights == 1)
          return 3.131208;
        if (sevens == 1)
          return 3.131207;
        if (sixes == 1)
          return 3.131206;
        if (fives == 1)
          return 3.131205;
        if (fours == 1)
          return 3.131204;
        if (threes == 1)
          return 3.131203;
        if (twos == 1)
          return 3.131202;
      } // if end
      if (jacks == 2) {
        if (aces == 1)
          return 3.131114;
        if (queens == 1)
          return 3.131112;
        if (tens == 1)
          return 3.131110;
        if (nines == 1)
          return 3.131109;
        if (eights == 1)
          return 3.131108;
        if (sevens == 1)
          return 3.131107;
        if (sixes == 1)
          return 3.131106;
        if (fives == 1)
          return 3.131105;
        if (fours == 1)
          return 3.131104;
        if (threes == 1)
          return 3.131103;
        if (twos == 1)
          return 3.131102;
      } // if end
      if (tens == 2) {
        if (aces == 1)
          return 3.131014;
        if (queens == 1)
          return 3.131012;
        if (jacks == 1)
          return 3.131011;
        if (nines == 1)
          return 3.131009;
        if (eights == 1)
          return 3.131008;
        if (sevens == 1)
          return 3.131007;
        if (sixes == 1)
          return 3.131006;
        if (fives == 1)
          return 3.131005;
        if (fours == 1)
          return 3.131004;
        if (threes == 1)
          return 3.131003;
         if (twos == 1)
          return 3.131002;
      } // if end
      if (nines == 2) {
        if (aces == 1)
          return 3.130914;
        if (queens == 1)
          return 3.130912;
        if (jacks == 1)
          return 3.130911;
        if (tens == 1)
          return 3.130910;
        if (eights == 1)
          return 3.130908;
        if (sevens == 1)
          return 3.130907;
        if (sixes == 1)
          return 3.130906;
        if (fives == 1)
          return 3.130905;
        if (fours == 1)
          return 3.130904;
        if (threes == 1)
          return 3.130903;
        if (twos == 1)
          return 3.130902;
      } // if end
      if (eights == 2) {
        if (aces == 1)
          return 3.130814;
        if (queens == 1)
          return 3.130812;
        if (jacks == 1)
          return 3.130811;
        if (tens == 1)
          return 3.130810;
        if (nines == 1)
          return 3.130809;
        if (sevens == 1)
          return 3.130807;
        if (sixes == 1)
          return 3.130806;
        if (fives == 1)
          return 3.130805;
        if (fours == 1)
          return 3.130804;
        if (threes == 1)
          return 3.130803;
        if (twos == 1)
          return 3.130802;
      } // if end
      if (sevens == 2) {
        if (aces == 1)
          return 3.130714;
        if (queens == 1)
          return 3.130712;
        if (jacks == 1)
          return 3.130711;
        if (tens == 1)
          return 3.130710;
        if (nines == 1)
          return 3.130709;
        if (eights == 1)
          return 3.130708;
        if (sixes == 1)
          return 3.130706;
        if (fives == 1)
          return 3.130705;
        if (fours == 1)
          return 3.130704;
        if (threes == 1)
          return 3.130703;
        if (twos == 1)
          return 3.130702;
      } // if end
      if (sixes == 2) {
        if (aces == 1)
          return 3.130614;
        if (queens == 1)
          return 3.130612;
        if (jacks == 1)
          return 3.130611;
        if (tens == 1)
          return 3.130610;
        if (nines == 1)
          return 3.130609;
        if (eights == 1)
          return 3.130608;
        if (sevens == 1)
          return 3.130607;
        if (fives == 1)
          return 3.130605;
        if (fours == 1)
          return 3.130604;
        if (threes == 1)
          return 3.130603;
        if (twos == 1)
          return 3.130602;
      } // if end
      if (fives == 2) {
        if (aces == 1)
          return 3.130514;
        if (queens == 1)
          return 3.130512;
        if (jacks == 1)
          return 3.130511;
        if (tens == 1)
          return 3.130510;
        if (nines == 1)
          return 3.130509;
        if (eights == 1)
          return 3.130508;
        if (sevens == 1)
          return 3.130507;
        if (sixes == 1)
          return 3.130506;
        if (fours == 1)
          return 3.130504;
        if (threes == 1)
          return 3.130503;
        if (twos == 1)
          return 3.130502;
      } // if end
      if (fours == 2) {
        if (aces == 1)
          return 3.130414;
        if (queens == 1)
          return 3.130412;
        if (jacks == 1)
          return 3.130411;
        if (tens == 1)
          return 3.130410;
        if (nines == 1)
          return 3.130409;
        if (eights == 1)
          return 3.130408;
        if (sevens == 1)
          return 3.130407;
        if (sixes == 1)
          return 3.130406;
        if (fives == 1)
          return 3.130405;
        if (threes == 1)
          return 3.130403;
        if (twos == 1)
          return 3.130402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.130314;
        if (queens == 1)
          return 3.130312;
        if (jacks == 1)
          return 3.130311;
        if (tens == 1)
          return 3.130310;
        if (nines == 1)
          return 3.130309;
        if (eights == 1)
          return 3.130308;
        if (sevens == 1)
          return 3.130307;
        if (sixes == 1)
          return 3.130306;
        if (fives == 1)
          return 3.130305;
        if (fours == 1)
          return 3.130304;
        if (twos == 1)
          return 3.130302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.130214;
        if (queens == 1)
           return 3.130212;
        if (jacks == 1)
           return 3.130211;
        if (tens == 1)
           return 3.130210;
        if (nines == 1)
           return 3.130209;
        if (eights == 1)
           return 3.130208;
        if (sevens == 1)
           return 3.130207;
        if (sixes == 1)
           return 3.130206;
        if (fives == 1)
           return 3.130205;
        if (fours == 1)
           return 3.130204;
        if (threes == 1)
           return 3.130203;
        } // if end
    } // if end
    if (queens == 2) {
      if (jacks == 2) {
        if (aces == 1)
          return 3.121114;
        if (kings == 1)
          return 3.121113;
        if (tens == 1)
          return 3.121110;
        if (nines == 1)
          return 3.121109;
        if (eights == 1)
          return 3.121108;
        if (sevens == 1)
          return 3.121107;
        if (sixes == 1)
          return 3.121106;
        if (fives == 1)
          return 3.121105;
        if (fours == 1)
          return 3.121104;
        if (threes == 1)
          return 3.121103;
        if (twos == 1)
          return 3.121102;
      } // if end
      if (tens == 2) {
        if (aces == 1)
          return 3.121014;
        if (kings == 1)
          return 3.121013;
        if (jacks == 1)
          return 3.121011;
        if (nines == 1)
          return 3.121009;
        if (eights == 1)
          return 3.121008;
        if (sevens == 1)
          return 3.121007;
        if (sixes == 1)
          return 3.121006;
        if (fives == 1)
          return 3.121005;
        if (fours == 1)
          return 3.121004;
        if (threes == 1)
          return 3.121003;
         if (twos == 1)
          return 3.121002;
      } // if end
      if (nines == 2) {
        if (aces == 1)
          return 3.120914;
        if (kings == 1)
          return 3.120913;
        if (jacks == 1)
          return 3.120911;
        if (tens == 1)
          return 3.120910;
        if (eights == 1)
          return 3.120908;
        if (sevens == 1)
          return 3.120907;
        if (sixes == 1)
          return 3.120906;
        if (fives == 1)
          return 3.120905;
        if (fours == 1)
          return 3.120904;
        if (threes == 1)
          return 3.120903;
        if (twos == 1)
          return 3.120902;
      } // if end
      if (eights == 2) {
        if (aces == 1)
          return 3.120814;
        if (kings == 1)
          return 3.120813;
        if (jacks == 1)
          return 3.120811;
        if (tens == 1)
          return 3.120810;
        if (nines == 1)
          return 3.120809;
        if (sevens == 1)
          return 3.120807;
        if (sixes == 1)
          return 3.120806;
        if (fives == 1)
          return 3.120805;
        if (fours == 1)
          return 3.120804;
        if (threes == 1)
          return 3.120803;
        if (twos == 1)
          return 3.120802;
      } // if end
      if (sevens == 2) {
        if (aces == 1)
          return 3.120714;
        if (kings == 1)
          return 3.120713;
        if (jacks == 1)
          return 3.120711;
        if (tens == 1)
          return 3.120710;
        if (nines == 1)
          return 3.120709;
        if (eights == 1)
          return 3.120708;
        if (sixes == 1)
          return 3.120706;
        if (fives == 1)
          return 3.120705;
        if (fours == 1)
          return 3.120704;
        if (threes == 1)
          return 3.120703;
        if (twos == 1)
          return 3.120702;
      } // if end
      if (sixes == 2) {
        if (aces == 1)
          return 3.120614;
        if (kings == 1)
          return 3.120613;
        if (jacks == 1)
          return 3.120611;
        if (tens == 1)
          return 3.120610;
        if (nines == 1)
          return 3.120609;
        if (eights == 1)
          return 3.120608;
        if (sevens == 1)
          return 3.120607;
        if (fives == 1)
          return 3.120605;
        if (fours == 1)
          return 3.120604;
        if (threes == 1)
          return 3.120603;
        if (twos == 1)
          return 3.120602;
      } // if end
      if (fives == 2) {
        if (aces == 1)
          return 3.120514;
        if (kings == 1)
          return 3.120513;
        if (jacks == 1)
          return 3.120511;
        if (tens == 1)
          return 3.120510;
        if (nines == 1)
          return 3.120509;
        if (eights == 1)
          return 3.120508;
        if (sevens == 1)
          return 3.120507;
        if (sixes == 1)
          return 3.120506;
        if (fours == 1)
          return 3.120504;
        if (threes == 1)
          return 3.120503;
        if (twos == 1)
          return 3.120502;
      } // if end
      if (fours == 2) {
        if (aces == 1)
          return 3.120414;
        if (kings == 1)
          return 3.120413;
        if (jacks == 1)
          return 3.120411;
        if (tens == 1)
          return 3.120410;
        if (nines == 1)
          return 3.120409;
        if (eights == 1)
          return 3.120408;
        if (sevens == 1)
          return 3.120407;
        if (sixes == 1)
          return 3.120406;
        if (fives == 1)
          return 3.120405;
        if (threes == 1)
          return 3.120403;
        if (twos == 1)
          return 3.120402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.120314;
        if (kings == 1)
          return 3.120313;
        if (jacks == 1)
          return 3.120311;
        if (tens == 1)
          return 3.120310;
        if (nines == 1)
          return 3.120309;
        if (eights == 1)
          return 3.120308;
        if (sevens == 1)
          return 3.120307;
        if (sixes == 1)
          return 3.120306;
        if (fives == 1)
          return 3.120305;
        if (fours == 1)
          return 3.120304;
        if (twos == 1)
          return 3.120302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.120214;
        if (kings == 1)
           return 3.120213;
        if (jacks == 1)
           return 3.120211;
        if (tens == 1)
           return 3.120210;
        if (nines == 1)
           return 3.120209;
        if (eights == 1)
           return 3.120208;
        if (sevens == 1)
           return 3.120207;
        if (sixes == 1)
           return 3.120206;
        if (fives == 1)
           return 3.120205;
        if (fours == 1)
           return 3.120204;
        if (threes == 1)
           return 3.120203;
        } // if end
    } // if end
    if (jacks == 2) {
      if (tens == 2) {
        if (aces == 1)
          return 3.111014;
        if (kings == 1)
          return 3.111013;
        if (queens == 1)
          return 3.111012;
        if (nines == 1)
          return 3.111009;
        if (eights == 1)
          return 3.111008;
        if (sevens == 1)
          return 3.111007;
        if (sixes == 1)
          return 3.111006;
        if (fives == 1)
          return 3.111005;
        if (fours == 1)
          return 3.111004;
        if (threes == 1)
          return 3.111003;
         if (twos == 1)
          return 3.111002;
      } // if end
      if (nines == 2) {
        if (aces == 1)
          return 3.110914;
        if (kings == 1)
          return 3.110913;
        if (queens == 1)
          return 3.110912;
        if (tens == 1)
          return 3.110910;
        if (eights == 1)
          return 3.110908;
        if (sevens == 1)
          return 3.110907;
        if (sixes == 1)
          return 3.110906;
        if (fives == 1)
          return 3.110905;
        if (fours == 1)
          return 3.110904;
        if (threes == 1)
          return 3.110903;
        if (twos == 1)
          return 3.110902;
      } // if end
      if (eights == 2) {
        if (aces == 1)
          return 3.110814;
        if (kings == 1)
          return 3.110813;
        if (queens == 1)
          return 3.110812;
        if (tens == 1)
          return 3.110810;
        if (nines == 1)
          return 3.110809;
        if (sevens == 1)
          return 3.110807;
        if (sixes == 1)
          return 3.110806;
        if (fives == 1)
          return 3.110805;
        if (fours == 1)
          return 3.110804;
        if (threes == 1)
          return 3.110803;
        if (twos == 1)
          return 3.110802;
      } // if end
      if (sevens == 2) {
        if (aces == 1)
          return 3.110714;
        if (kings == 1)
          return 3.110713;
        if (queens == 1)
          return 3.110712;
        if (tens == 1)
          return 3.110710;
        if (nines == 1)
          return 3.110709;
        if (eights == 1)
          return 3.110708;
        if (sixes == 1)
          return 3.110706;
        if (fives == 1)
          return 3.110705;
        if (fours == 1)
          return 3.110704;
        if (threes == 1)
          return 3.110703;
        if (twos == 1)
          return 3.110702;
      } // if end
      if (sixes == 2) {
        if (aces == 1)
          return 3.110614;
        if (kings == 1)
          return 3.110613;
        if (queens == 1)
          return 3.110612;
        if (tens == 1)
          return 3.110610;
        if (nines == 1)
          return 3.110609;
        if (eights == 1)
          return 3.110608;
        if (sevens == 1)
          return 3.110607;
        if (fives == 1)
          return 3.110605;
        if (fours == 1)
          return 3.110604;
        if (threes == 1)
          return 3.110603;
        if (twos == 1)
          return 3.110602;
      } // if end
      if (fives == 2) {
        if (aces == 1)
          return 3.110514;
        if (kings == 1)
          return 3.110513;
        if (queens == 1)
          return 3.110512;
        if (tens == 1)
          return 3.110510;
        if (nines == 1)
          return 3.110509;
        if (eights == 1)
          return 3.110508;
        if (sevens == 1)
          return 3.110507;
        if (sixes == 1)
          return 3.110506;
        if (fours == 1)
          return 3.110504;
        if (threes == 1)
          return 3.110503;
        if (twos == 1)
          return 3.110502;
      } // if end
      if (fours == 2) {
        if (aces == 1)
          return 3.110414;
        if (kings == 1)
          return 3.110413;
        if (queens == 1)
          return 3.110412;
        if (tens == 1)
          return 3.110410;
        if (nines == 1)
          return 3.110409;
        if (eights == 1)
          return 3.110408;
        if (sevens == 1)
          return 3.110407;
        if (sixes == 1)
          return 3.110406;
        if (fives == 1)
          return 3.110405;
        if (threes == 1)
          return 3.110403;
        if (twos == 1)
          return 3.110402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.110314;
        if (kings == 1)
          return 3.110313;
        if (queens == 1)
          return 3.110312;
        if (tens == 1)
          return 3.110310;
        if (nines == 1)
          return 3.110309;
        if (eights == 1)
          return 3.110308;
        if (sevens == 1)
          return 3.110307;
        if (sixes == 1)
          return 3.110306;
        if (fives == 1)
          return 3.110305;
        if (fours == 1)
          return 3.110304;
        if (twos == 1)
          return 3.110302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.110214;
        if (kings == 1)
           return 3.110213;
        if (queens == 1)
           return 3.110212;
        if (tens == 1)
           return 3.110210;
        if (nines == 1)
           return 3.110209;
        if (eights == 1)
           return 3.110208;
        if (sevens == 1)
           return 3.110207;
        if (sixes == 1)
           return 3.110206;
        if (fives == 1)
           return 3.110205;
        if (fours == 1)
           return 3.110204;
        if (threes == 1)
           return 3.110203;
        } // if end
    } // if end
    if (tens == 2) {
      if (nines == 2) {
        if (aces == 1)
          return 3.100914;
        if (kings == 1)
          return 3.100913;
        if (queens == 1)
          return 3.100912;
        if (jacks == 1)
          return 3.100911;
        if (eights == 1)
          return 3.100908;
        if (sevens == 1)
          return 3.100907;
        if (sixes == 1)
          return 3.100906;
        if (fives == 1)
          return 3.100905;
        if (fours == 1)
          return 3.100904;
        if (threes == 1)
          return 3.100903;
        if (twos == 1)
          return 3.100902;
      } // if end
      if (eights == 2) {
        if (aces == 1)
          return 3.100814;
        if (kings == 1)
          return 3.100813;
        if (queens == 1)
          return 3.100812;
        if (jacks == 1)
          return 3.100811;
        if (nines == 1)
          return 3.100809;
        if (sevens == 1)
          return 3.100807;
        if (sixes == 1)
          return 3.100806;
        if (fives == 1)
          return 3.100805;
        if (fours == 1)
          return 3.100804;
        if (threes == 1)
          return 3.100803;
        if (twos == 1)
          return 3.100802;
      } // if end
      if (sevens == 2) {
        if (aces == 1)
          return 3.100714;
        if (kings == 1)
          return 3.100713;
        if (queens == 1)
          return 3.100712;
        if (jacks == 1)
          return 3.100711;
        if (nines == 1)
          return 3.100709;
        if (eights == 1)
          return 3.100708;
        if (sixes == 1)
          return 3.100706;
        if (fives == 1)
          return 3.100705;
        if (fours == 1)
          return 3.100704;
        if (threes == 1)
          return 3.100703;
        if (twos == 1)
          return 3.100702;
      } // if end
      if (sixes == 2) {
        if (aces == 1)
          return 3.100614;
        if (kings == 1)
          return 3.100613;
        if (queens == 1)
          return 3.100612;
        if (jacks == 1)
          return 3.100611;
        if (nines == 1)
          return 3.100609;
        if (eights == 1)
          return 3.100608;
        if (sevens == 1)
          return 3.100607;
        if (fives == 1)
          return 3.100605;
        if (fours == 1)
          return 3.100604;
        if (threes == 1)
          return 3.100603;
        if (twos == 1)
          return 3.100602;
      } // if end
      if (fives == 2) {
        if (aces == 1)
          return 3.100514;
        if (kings == 1)
          return 3.100513;
        if (queens == 1)
          return 3.100512;
        if (jacks == 1)
          return 3.100511;
        if (nines == 1)
          return 3.100509;
        if (eights == 1)
          return 3.100508;
        if (sevens == 1)
          return 3.100507;
        if (sixes == 1)
          return 3.100506;
        if (fours == 1)
          return 3.100504;
        if (threes == 1)
          return 3.100503;
        if (twos == 1)
          return 3.100502;
      } // if end
      if (fours == 2) {
        if (aces == 1)
          return 3.100414;
        if (kings == 1)
          return 3.100413;
        if (queens == 1)
          return 3.100412;
        if (jacks == 1)
          return 3.100411;
        if (nines == 1)
          return 3.100409;
        if (eights == 1)
          return 3.100408;
        if (sevens == 1)
          return 3.100407;
        if (sixes == 1)
          return 3.100406;
        if (fives == 1)
          return 3.100405;
        if (threes == 1)
          return 3.100403;
        if (twos == 1)
          return 3.100402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.100314;
        if (kings == 1)
          return 3.100313;
        if (queens == 1)
          return 3.100312;
        if (jacks == 1)
          return 3.100311;
        if (nines == 1)
          return 3.100309;
        if (eights == 1)
          return 3.100308;
        if (sevens == 1)
          return 3.100307;
        if (sixes == 1)
          return 3.100306;
        if (fives == 1)
          return 3.100305;
        if (fours == 1)
          return 3.100304;
        if (twos == 1)
          return 3.100302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.100214;
        if (kings == 1)
           return 3.100213;
        if (queens == 1)
           return 3.100212;
        if (jacks == 1)
           return 3.100211;
        if (nines == 1)
           return 3.100209;
        if (eights == 1)
           return 3.100208;
        if (sevens == 1)
           return 3.100207;
        if (sixes == 1)
           return 3.100206;
        if (fives == 1)
           return 3.100205;
        if (fours == 1)
           return 3.100204;
        if (threes == 1)
           return 3.100203;
        } // if end
    } // if end
    if (nines == 2) {
      if (eights == 2) {
        if (aces == 1)
          return 3.090814;
        if (kings == 1)
          return 3.090813;
        if (queens == 1)
          return 3.090812;
        if (jacks == 1)
          return 3.090811;
        if (tens == 1)
          return 3.090810;
        if (sevens == 1)
          return 3.090807;
        if (sixes == 1)
          return 3.090806;
        if (fives == 1)
          return 3.090805;
        if (fours == 1)
          return 3.090804;
        if (threes == 1)
          return 3.090803;
        if (twos == 1)
          return 3.090802;
      } // if end
      if (sevens == 2) {
        if (aces == 1)
          return 3.090714;
        if (kings == 1)
          return 3.090713;
        if (queens == 1)
          return 3.090712;
        if (jacks == 1)
          return 3.090711;
        if (tens == 1)
          return 3.090710;
        if (eights == 1)
          return 3.090708;
        if (sixes == 1)
          return 3.090706;
        if (fives == 1)
          return 3.090705;
        if (fours == 1)
          return 3.090704;
        if (threes == 1)
          return 3.090703;
        if (twos == 1)
          return 3.090702;
      } // if end
      if (sixes == 2) {
        if (aces == 1)
          return 3.090614;
        if (kings == 1)
          return 3.090613;
        if (queens == 1)
          return 3.090612;
        if (jacks == 1)
          return 3.090611;
        if (tens == 1)
          return 3.090610;
        if (eights == 1)
          return 3.090608;
        if (sevens == 1)
          return 3.090607;
        if (fives == 1)
          return 3.090605;
        if (fours == 1)
          return 3.090604;
        if (threes == 1)
          return 3.090603;
        if (twos == 1)
          return 3.090602;
      } // if end
      if (fives == 2) {
        if (aces == 1)
          return 3.090514;
        if (kings == 1)
          return 3.090513;
        if (queens == 1)
          return 3.090512;
        if (jacks == 1)
          return 3.090511;
        if (tens == 1)
          return 3.090510;
        if (eights == 1)
          return 3.090508;
        if (sevens == 1)
          return 3.090507;
        if (sixes == 1)
          return 3.090506;
        if (fours == 1)
          return 3.090504;
        if (threes == 1)
          return 3.090503;
        if (twos == 1)
          return 3.090502;
      } // if end
      if (fours == 2) {
        if (aces == 1)
          return 3.090414;
        if (kings == 1)
          return 3.090413;
        if (queens == 1)
          return 3.090412;
        if (jacks == 1)
          return 3.090411;
        if (tens == 1)
          return 3.090410;
        if (eights == 1)
          return 3.090408;
        if (sevens == 1)
          return 3.090407;
        if (sixes == 1)
          return 3.090406;
        if (fives == 1)
          return 3.090405;
        if (threes == 1)
          return 3.090403;
        if (twos == 1)
          return 3.090402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.090314;
        if (kings == 1)
          return 3.090313;
        if (queens == 1)
          return 3.090312;
        if (jacks == 1)
          return 3.090311;
        if (tens == 1)
          return 3.090310;
        if (eights == 1)
          return 3.090308;
        if (sevens == 1)
          return 3.090307;
        if (sixes == 1)
          return 3.090306;
        if (fives == 1)
          return 3.090305;
        if (fours == 1)
          return 3.090304;
        if (twos == 1)
          return 3.090302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.090214;
        if (kings == 1)
           return 3.090213;
        if (queens == 1)
           return 3.090212;
        if (jacks == 1)
           return 3.090211;
        if (tens == 1)
           return 3.090210;
        if (eights == 1)
           return 3.090208;
        if (sevens == 1)
           return 3.090207;
        if (sixes == 1)
           return 3.090206;
        if (fives == 1)
           return 3.090205;
        if (fours == 1)
           return 3.090204;
        if (threes == 1)
           return 3.090203;
        } // if end
    } // if end
    if (eights == 2) {
      if (sevens == 2) {
        if (aces == 1)
          return 3.080714;
        if (kings == 1)
          return 3.080713;
        if (queens == 1)
          return 3.080712;
        if (jacks == 1)
          return 3.080711;
        if (tens == 1)
          return 3.080710;
        if (nines == 1)
          return 3.080709;
        if (sixes == 1)
          return 3.080706;
        if (fives == 1)
          return 3.080705;
        if (fours == 1)
          return 3.080704;
        if (threes == 1)
          return 3.080703;
        if (twos == 1)
          return 3.080702;
      } // if end
      if (sixes == 2) {
        if (aces == 1)
          return 3.080614;
        if (kings == 1)
          return 3.080613;
        if (queens == 1)
          return 3.080612;
        if (jacks == 1)
          return 3.080611;
        if (tens == 1)
          return 3.080610;
        if (nines == 1)
          return 3.080609;
        if (sevens == 1)
          return 3.080607;
        if (fives == 1)
          return 3.080605;
        if (fours == 1)
          return 3.080604;
        if (threes == 1)
          return 3.080603;
        if (twos == 1)
          return 3.080602;
      } // if end
      if (fives == 2) {
        if (aces == 1)
          return 3.080514;
        if (kings == 1)
          return 3.080513;
        if (queens == 1)
          return 3.080512;
        if (jacks == 1)
          return 3.080511;
        if (tens == 1)
          return 3.080510;
        if (nines == 1)
          return 3.080509;
        if (sevens == 1)
          return 3.080507;
        if (sixes == 1)
          return 3.080506;
        if (fours == 1)
          return 3.080504;
        if (threes == 1)
          return 3.080503;
        if (twos == 1)
          return 3.080502;
      } // if end
      if (fours == 2) {
        if (aces == 1)
          return 3.080414;
        if (kings == 1)
          return 3.080413;
        if (queens == 1)
          return 3.080412;
        if (jacks == 1)
          return 3.080411;
        if (tens == 1)
          return 3.080410;
        if (nines == 1)
          return 3.080409;
        if (sevens == 1)
          return 3.080407;
        if (sixes == 1)
          return 3.080406;
        if (fives == 1)
          return 3.080405;
        if (threes == 1)
          return 3.080403;
        if (twos == 1)
          return 3.080402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.080314;
        if (kings == 1)
          return 3.080313;
        if (queens == 1)
          return 3.080312;
        if (jacks == 1)
          return 3.080311;
        if (tens == 1)
          return 3.080310;
        if (nines == 1)
          return 3.080309;
        if (sevens == 1)
          return 3.080307;
        if (sixes == 1)
          return 3.080306;
        if (fives == 1)
          return 3.080305;
        if (fours == 1)
          return 3.080304;
        if (twos == 1)
          return 3.080302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.080214;
        if (kings == 1)
           return 3.080213;
        if (queens == 1)
           return 3.080212;
        if (jacks == 1)
           return 3.080211;
        if (tens == 1)
           return 3.080210;
        if (nines == 1)
           return 3.080209;
        if (sevens == 1)
           return 3.080207;
        if (sixes == 1)
           return 3.080206;
        if (fives == 1)
           return 3.080205;
        if (fours == 1)
           return 3.080204;
        if (threes == 1)
           return 3.080203;
        } // if end
    } // if end
    if (sevens == 2) {
      if (sixes == 2) {
        if (aces == 1)
          return 3.070614;
        if (kings == 1)
          return 3.070613;
        if (queens == 1)
          return 3.070612;
        if (jacks == 1)
          return 3.070611;
        if (tens == 1)
          return 3.070610;
        if (nines == 1)
          return 3.070609;
        if (eights == 1)
          return 3.070608;
        if (fives == 1)
          return 3.070605;
        if (fours == 1)
          return 3.070604;
        if (threes == 1)
          return 3.070603;
        if (twos == 1)
          return 3.070602;
      } // if end
      if (fives == 2) {
        if (aces == 1)
          return 3.070514;
        if (kings == 1)
          return 3.070513;
        if (queens == 1)
          return 3.070512;
        if (jacks == 1)
          return 3.070511;
        if (tens == 1)
          return 3.070510;
        if (nines == 1)
          return 3.070509;
        if (eights == 1)
          return 3.070508;
        if (sixes == 1)
          return 3.070506;
        if (fours == 1)
          return 3.070504;
        if (threes == 1)
          return 3.070503;
        if (twos == 1)
          return 3.070502;
      } // if end
      if (fours == 2) {
        if (aces == 1)
          return 3.070414;
        if (kings == 1)
          return 3.070413;
        if (queens == 1)
          return 3.070412;
        if (jacks == 1)
          return 3.070411;
        if (tens == 1)
          return 3.070410;
        if (nines == 1)
          return 3.070409;
        if (eights == 1)
          return 3.070408;
        if (sixes == 1)
          return 3.070406;
        if (fives == 1)
          return 3.070405;
        if (threes == 1)
          return 3.070403;
        if (twos == 1)
          return 3.070402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.070314;
        if (kings == 1)
          return 3.070313;
        if (queens == 1)
          return 3.070312;
        if (jacks == 1)
          return 3.070311;
        if (tens == 1)
          return 3.070310;
        if (nines == 1)
          return 3.070309;
        if (eights == 1)
          return 3.070308;
        if (sixes == 1)
          return 3.070306;
        if (fives == 1)
          return 3.070305;
        if (fours == 1)
          return 3.070304;
        if (twos == 1)
          return 3.070302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.070214;
        if (kings == 1)
           return 3.070213;
        if (queens == 1)
           return 3.070212;
        if (jacks == 1)
           return 3.070211;
        if (tens == 1)
           return 3.070210;
        if (nines == 1)
           return 3.070209;
        if (eights == 1)
           return 3.070208;
        if (sixes == 1)
           return 3.070206;
        if (fives == 1)
           return 3.070205;
        if (fours == 1)
           return 3.070204;
        if (threes == 1)
           return 3.070203;
        } // if end
    } // if end
    if (sixes == 2) {
      if (fives == 2) {
        if (aces == 1)
          return 3.060514;
        if (kings == 1)
          return 3.060513;
        if (queens == 1)
          return 3.060512;
        if (jacks == 1)
          return 3.060511;
        if (tens == 1)
          return 3.060510;
        if (nines == 1)
          return 3.060509;
        if (eights == 1)
          return 3.060508;
        if (sevens == 1)
          return 3.060507;
        if (fours == 1)
          return 3.060504;
        if (threes == 1)
          return 3.060503;
        if (twos == 1)
          return 3.060502;
      } // if end
      if (fours == 2) {
        if (aces == 1)
          return 3.060414;
        if (kings == 1)
          return 3.060413;
        if (queens == 1)
          return 3.060412;
        if (jacks == 1)
          return 3.060411;
        if (tens == 1)
          return 3.060410;
        if (nines == 1)
          return 3.060409;
        if (eights == 1)
          return 3.060408;
        if (sevens == 1)
          return 3.060407;
        if (fives == 1)
          return 3.060405;
        if (threes == 1)
          return 3.060403;
        if (twos == 1)
          return 3.060402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.060314;
        if (kings == 1)
          return 3.060313;
        if (queens == 1)
          return 3.060312;
        if (jacks == 1)
          return 3.060311;
        if (tens == 1)
          return 3.060310;
        if (nines == 1)
          return 3.060309;
        if (eights == 1)
          return 3.060308;
        if (sevens == 1)
          return 3.060307;
        if (fives == 1)
          return 3.060305;
        if (fours == 1)
          return 3.060304;
        if (twos == 1)
          return 3.060302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.060214;
        if (kings == 1)
           return 3.060213;
        if (queens == 1)
           return 3.060212;
        if (jacks == 1)
           return 3.060211;
        if (tens == 1)
           return 3.060210;
        if (nines == 1)
           return 3.060209;
        if (eights == 1)
           return 3.060208;
        if (sevens == 1)
           return 3.060207;
        if (fives == 1)
           return 3.060205;
        if (fours == 1)
           return 3.060204;
        if (threes == 1)
           return 3.060203;
        } // if end
    } // if end
    if (fives == 2) {
      if (fours == 2) {
        if (aces == 1)
          return 3.050414;
        if (kings == 1)
          return 3.050413;
        if (queens == 1)
          return 3.050412;
        if (jacks == 1)
          return 3.050411;
        if (tens == 1)
          return 3.050410;
        if (nines == 1)
          return 3.050409;
        if (eights == 1)
          return 3.050408;
        if (sevens == 1)
          return 3.050407;
        if (sixes == 1)
          return 3.050406;
        if (threes == 1)
          return 3.050403;
        if (twos == 1)
          return 3.050402;
      } // if end
      if (threes == 2) {
        if (aces == 1)
          return 3.050314;
        if (kings == 1)
          return 3.050313;
        if (queens == 1)
          return 3.050312;
        if (jacks == 1)
          return 3.050311;
        if (tens == 1)
          return 3.050310;
        if (nines == 1)
          return 3.050309;
        if (eights == 1)
          return 3.050308;
        if (sevens == 1)
          return 3.050307;
        if (sixes == 1)
          return 3.050306;
        if (fours == 1)
          return 3.050304;
        if (twos == 1)
          return 3.050302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.050214;
        if (kings == 1)
           return 3.050213;
        if (queens == 1)
           return 3.050212;
        if (jacks == 1)
           return 3.050211;
        if (tens == 1)
           return 3.050210;
        if (nines == 1)
           return 3.050209;
        if (eights == 1)
           return 3.050208;
        if (sevens == 1)
           return 3.050207;
        if (sixes == 1)
           return 3.050206;
        if (fours == 1)
           return 3.050204;
        if (threes == 1)
           return 3.050203;
        } // if end
    } // if end
    if (fours == 2) {
      if (threes == 2) {
        if (aces == 1)
          return 3.040314;
        if (kings == 1)
          return 3.040313;
        if (queens == 1)
          return 3.040312;
        if (jacks == 1)
          return 3.040311;
        if (tens == 1)
          return 3.040310;
        if (nines == 1)
          return 3.040309;
        if (eights == 1)
          return 3.040308;
        if (sevens == 1)
          return 3.040307;
        if (sixes == 1)
          return 3.040306;
        if (fives == 1)
          return 3.040305;
        if (twos == 1)
          return 3.040302;
      } // if end
      if (twos == 2) {
        if (aces == 1)
           return 3.040214;
        if (kings == 1)
           return 3.040213;
        if (queens == 1)
           return 3.040212;
        if (jacks == 1)
           return 3.040211;
        if (tens == 1)
           return 3.040210;
        if (nines == 1)
           return 3.040209;
        if (eights == 1)
           return 3.040208;
        if (sevens == 1)
           return 3.040207;
        if (sixes == 1)
           return 3.040206;
        if (fives == 1)
           return 3.040205;
        if (threes == 1)
           return 3.040203;
        } // if end
    } // if end
    if (threes == 2) {
      if (twos == 2) {
        if (aces == 1)
           return 3.030214;
        if (kings == 1)
           return 3.030213;
        if (queens == 1)
           return 3.030212;
        if (jacks == 1)
           return 3.030211;
        if (tens == 1)
           return 3.030210;
        if (nines == 1)
           return 3.030209;
        if (eights == 1)
           return 3.030208;
        if (sevens == 1)
           return 3.030207;
        if (sixes == 1)
           return 3.030206;
        if (fives == 1)
           return 3.030205;
        if (fours == 1)
           return 3.030204;
        } // if end
    } // if end

    if (aces == 2) {
      if (kings >= 1) {
        if (queens >= 1)
          return 2.141312;
        if (jacks >= 1)
          return 2.141311;
        if (tens >= 1)
          return 2.141310;
        if (nines >= 1)
          return 2.141309;
        if (eights >= 1)
          return 2.141308;
        if (sevens >= 1)
          return 2.141307;
        if (sixes >= 1)
          return 2.141306;
        if (fives >= 1)
          return 2.141305;
        if (fours >= 1)
          return 2.141304;
        if (threes >= 1)
          return 2.141303;
        if (twos >= 1)
          return 2.141302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.141211;
        if (tens >= 1)
          return 2.141210;
        if (nines >= 1)
          return 2.141209;
        if (eights >= 1)
          return 2.141208;
        if (sevens >= 1)
          return 2.141207;
        if (sixes >= 1)
          return 2.141206;
        if (fives >= 1)
          return 2.141205;
        if (fours >= 1)
          return 2.141204;
        if (threes >= 1)
          return 2.141203;
        if (twos >= 1)
          return 2.141202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.141110;
        if (nines >= 1)
          return 2.141109;
        if (eights >= 1)
          return 2.141108;
        if (sevens >= 1)
          return 2.141107;
        if (sixes >= 1)
          return 2.141106;
        if (fives >= 1)
          return 2.141105;
        if (fours >= 1)
          return 2.141104;
        if (threes >= 1)
          return 2.141103;
        if (twos >= 1)
          return 2.141102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.141009;
        if (eights >= 1)
          return 2.141008;
        if (sevens >= 1)
          return 2.141007;
        if (sixes >= 1)
          return 2.141006;
        if (fives >= 1)
          return 2.141005;
        if (fours >= 1)
          return 2.141004;
        if (threes >= 1)
          return 2.141003;
        if (twos >= 1)
          return 2.141002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.140908;
        if (sevens >= 1)
          return 2.140907;
        if (sixes >= 1)
          return 2.140906;
        if (fives >= 1)
          return 2.140905;
        if (fours >= 1)
          return 2.140904;
        if (threes >= 1)
          return 2.140903;
        if (twos >= 1)
          return 2.140902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.140807;
        if (sixes >= 1)
          return 2.140806;
        if (fives >= 1)
          return 2.140805;
        if (fours >= 1)
          return 2.140804;
        if (threes >= 1)
          return 2.140803;
        if (twos >= 1)
          return 2.140802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.140706;
        if (fives >= 1)
          return 2.140705;
        if (fours >= 1)
          return 2.140704;
        if (threes >= 1)
          return 2.140703;
        if (twos >= 1)
          return 2.140702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.140605;
        if (fours >= 1)
          return 2.140604;
        if (threes >= 1)
          return 2.140603;
        if (twos >= 1)
          return 2.140602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.140504;
        if (threes >= 1)
          return 2.140503;
        if (twos >= 1)
          return 2.140502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.140403;
        if (twos >= 1)
          return 2.140402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.140302;
    } // if end
    if (kings == 2) {
      if (aces >= 1) {
        if (queens >= 1)
          return 2.131412;
        if (jacks >= 1)
          return 2.131411;
        if (tens >= 1)
          return 2.131410;
        if (nines >= 1)
          return 2.131409;
        if (eights >= 1)
          return 2.131408;
        if (sevens >= 1)
          return 2.131407;
        if (sixes >= 1)
          return 2.131406;
        if (fives >= 1)
          return 2.131405;
        if (fours >= 1)
          return 2.131404;
        if (threes >= 1)
          return 2.131403;
        if (twos >= 1)
          return 2.131402;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.131211;
        if (tens >= 1)
          return 2.131210;
        if (nines >= 1)
          return 2.131209;
        if (eights >= 1)
          return 2.131208;
        if (sevens >= 1)
          return 2.131207;
        if (sixes >= 1)
          return 2.131206;
        if (fives >= 1)
          return 2.131205;
        if (fours >= 1)
          return 2.131204;
        if (threes >= 1)
          return 2.131203;
        if (twos >= 1)
          return 2.131202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.131110;
        if (nines >= 1)
          return 2.131109;
        if (eights >= 1)
          return 2.131108;
        if (sevens >= 1)
          return 2.131107;
        if (sixes >= 1)
          return 2.131106;
        if (fives >= 1)
          return 2.131105;
        if (fours >= 1)
          return 2.131104;
        if (threes >= 1)
          return 2.131103;
        if (twos >= 1)
          return 2.131102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.131009;
        if (eights >= 1)
          return 2.131008;
        if (sevens >= 1)
          return 2.131007;
        if (sixes >= 1)
          return 2.131006;
        if (fives >= 1)
          return 2.131005;
        if (fours >= 1)
          return 2.131004;
        if (threes >= 1)
          return 2.131003;
        if (twos >= 1)
          return 2.131002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.130908;
        if (sevens >= 1)
          return 2.130907;
        if (sixes >= 1)
          return 2.130906;
        if (fives >= 1)
          return 2.130905;
        if (fours >= 1)
          return 2.130904;
        if (threes >= 1)
          return 2.130903;
        if (twos >= 1)
          return 2.130902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.130807;
        if (sixes >= 1)
          return 2.130806;
        if (fives >= 1)
          return 2.130805;
        if (fours >= 1)
          return 2.130804;
        if (threes >= 1)
          return 2.130803;
        if (twos >= 1)
          return 2.130802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.130706;
        if (fives >= 1)
          return 2.130705;
        if (fours >= 1)
          return 2.130704;
        if (threes >= 1)
          return 2.130703;
        if (twos >= 1)
          return 2.130702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.130605;
        if (fours >= 1)
          return 2.130604;
        if (threes >= 1)
          return 2.130603;
        if (twos >= 1)
          return 2.130602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.130504;
        if (threes >= 1)
          return 2.130503;
        if (twos >= 1)
          return 2.130502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.130403;
        if (twos >= 1)
          return 2.130402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.130302;
    } // if end
    if (queens == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.121413;
        if (jacks >= 1)
          return 2.121411;
        if (tens >= 1)
          return 2.121410;
        if (nines >= 1)
          return 2.121409;
        if (eights >= 1)
          return 2.121408;
        if (sevens >= 1)
          return 2.121407;
        if (sixes >= 1)
          return 2.121406;
        if (fives >= 1)
          return 2.121405;
        if (fours >= 1)
          return 2.121404;
        if (threes >= 1)
          return 2.121403;
        if (twos >= 1)
          return 2.121402;
      } // if end
      if (kings >= 1) {
        if (jacks >= 1)
          return 2.121311;
        if (tens >= 1)
          return 2.121310;
        if (nines >= 1)
          return 2.121309;
        if (eights >= 1)
          return 2.121308;
        if (sevens >= 1)
          return 2.121307;
        if (sixes >= 1)
          return 2.121306;
        if (fives >= 1)
          return 2.121305;
        if (fours >= 1)
          return 2.121304;
        if (threes >= 1)
          return 2.121303;
        if (twos >= 1)
          return 2.121302;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.121110;
        if (nines >= 1)
          return 2.121109;
        if (eights >= 1)
          return 2.121108;
        if (sevens >= 1)
          return 2.121107;
        if (sixes >= 1)
          return 2.121106;
        if (fives >= 1)
          return 2.121105;
        if (fours >= 1)
          return 2.121104;
        if (threes >= 1)
          return 2.121103;
        if (twos >= 1)
          return 2.121102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.121009;
        if (eights >= 1)
          return 2.121008;
        if (sevens >= 1)
          return 2.121007;
        if (sixes >= 1)
          return 2.121006;
        if (fives >= 1)
          return 2.121005;
        if (fours >= 1)
          return 2.121004;
        if (threes >= 1)
          return 2.121003;
        if (twos >= 1)
          return 2.121002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.120908;
        if (sevens >= 1)
          return 2.120907;
        if (sixes >= 1)
          return 2.120906;
        if (fives >= 1)
          return 2.120905;
        if (fours >= 1)
          return 2.120904;
        if (threes >= 1)
          return 2.120903;
        if (twos >= 1)
          return 2.120902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.120807;
        if (sixes >= 1)
          return 2.120806;
        if (fives >= 1)
          return 2.120805;
        if (fours >= 1)
          return 2.120804;
        if (threes >= 1)
          return 2.120803;
        if (twos >= 1)
          return 2.120802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.120706;
        if (fives >= 1)
          return 2.120705;
        if (fours >= 1)
          return 2.120704;
        if (threes >= 1)
          return 2.120703;
        if (twos >= 1)
          return 2.120702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.120605;
        if (fours >= 1)
          return 2.120604;
        if (threes >= 1)
          return 2.120603;
        if (twos >= 1)
          return 2.120602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.120504;
        if (threes >= 1)
          return 2.120503;
        if (twos >= 1)
          return 2.120502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.120403;
        if (twos >= 1)
          return 2.120402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.120302;
    } // if end
    if (jacks == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.111413;
        if (queens >= 1)
          return 2.111412;
        if (tens >= 1)
          return 2.111410;
        if (nines >= 1)
          return 2.111409;
        if (eights >= 1)
          return 2.111408;
        if (sevens >= 1)
          return 2.111407;
        if (sixes >= 1)
          return 2.111406;
        if (fives >= 1)
          return 2.111405;
        if (fours >= 1)
          return 2.111404;
        if (threes >= 1)
          return 2.111403;
        if (twos >= 1)
          return 2.111402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.111312;
        if (tens >= 1)
          return 2.111310;
        if (nines >= 1)
          return 2.111309;
        if (eights >= 1)
          return 2.111308;
        if (sevens >= 1)
          return 2.111307;
        if (sixes >= 1)
          return 2.111306;
        if (fives >= 1)
          return 2.111305;
        if (fours >= 1)
          return 2.111304;
        if (threes >= 1)
          return 2.111303;
        if (twos >= 1)
          return 2.111302;
      } // if end
      if (queens >= 1) {
        if (tens >= 1)
          return 2.111210;
        if (nines >= 1)
          return 2.111209;
        if (eights >= 1)
          return 2.111208;
        if (sevens >= 1)
          return 2.111207;
        if (sixes >= 1)
          return 2.111206;
        if (fives >= 1)
          return 2.111205;
        if (fours >= 1)
          return 2.111204;
        if (threes >= 1)
          return 2.111203;
        if (twos >= 1)
          return 2.111202;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.111009;
        if (eights >= 1)
          return 2.111008;
        if (sevens >= 1)
          return 2.111007;
        if (sixes >= 1)
          return 2.111006;
        if (fives >= 1)
          return 2.111005;
        if (fours >= 1)
          return 2.111004;
        if (threes >= 1)
          return 2.111003;
        if (twos >= 1)
          return 2.111002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.110908;
        if (sevens >= 1)
          return 2.110907;
        if (sixes >= 1)
          return 2.110906;
        if (fives >= 1)
          return 2.110905;
        if (fours >= 1)
          return 2.110904;
        if (threes >= 1)
          return 2.110903;
        if (twos >= 1)
          return 2.110902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.110807;
        if (sixes >= 1)
          return 2.110806;
        if (fives >= 1)
          return 2.110805;
        if (fours >= 1)
          return 2.110804;
        if (threes >= 1)
          return 2.110803;
        if (twos >= 1)
          return 2.110802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.110706;
        if (fives >= 1)
          return 2.110705;
        if (fours >= 1)
          return 2.110704;
        if (threes >= 1)
          return 2.110703;
        if (twos >= 1)
          return 2.110702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.110605;
        if (fours >= 1)
          return 2.110604;
        if (threes >= 1)
          return 2.110603;
        if (twos >= 1)
          return 2.110602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.110504;
        if (threes >= 1)
          return 2.110503;
        if (twos >= 1)
          return 2.110502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.110403;
        if (twos >= 1)
          return 2.110402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.110302;
    } // if end
    if (tens == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.101413;
        if (queens >= 1)
          return 2.101412;
        if (jacks >= 1)
          return 2.101411;
        if (nines >= 1)
          return 2.101409;
        if (eights >= 1)
          return 2.101408;
        if (sevens >= 1)
          return 2.101407;
        if (sixes >= 1)
          return 2.101406;
        if (fives >= 1)
          return 2.101405;
        if (fours >= 1)
          return 2.101404;
        if (threes >= 1)
          return 2.101403;
        if (twos >= 1)
          return 2.101402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.101312;
        if (jacks >= 1)
          return 2.101311;
        if (nines >= 1)
          return 2.101309;
        if (eights >= 1)
          return 2.101308;
        if (sevens >= 1)
          return 2.101307;
        if (sixes >= 1)
          return 2.101306;
        if (fives >= 1)
          return 2.101305;
        if (fours >= 1)
          return 2.101304;
        if (threes >= 1)
          return 2.101303;
        if (twos >= 1)
          return 2.101302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.101211;
        if (nines >= 1)
          return 2.101209;
        if (eights >= 1)
          return 2.101208;
        if (sevens >= 1)
          return 2.101207;
        if (sixes >= 1)
          return 2.101206;
        if (fives >= 1)
          return 2.101205;
        if (fours >= 1)
          return 2.101204;
        if (threes >= 1)
          return 2.101203;
        if (twos >= 1)
          return 2.101202;
      } // if end
      if (jacks >= 1) {
        if (nines >= 1)
          return 2.101109;
        if (eights >= 1)
          return 2.101108;
        if (sevens >= 1)
          return 2.101107;
        if (sixes >= 1)
          return 2.101106;
        if (fives >= 1)
          return 2.101105;
        if (fours >= 1)
          return 2.101104;
        if (threes >= 1)
          return 2.101103;
        if (twos >= 1)
          return 2.101102;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.100908;
        if (sevens >= 1)
          return 2.100907;
        if (sixes >= 1)
          return 2.100906;
        if (fives >= 1)
          return 2.100905;
        if (fours >= 1)
          return 2.100904;
        if (threes >= 1)
          return 2.100903;
        if (twos >= 1)
          return 2.100902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.100807;
        if (sixes >= 1)
          return 2.100806;
        if (fives >= 1)
          return 2.100805;
        if (fours >= 1)
          return 2.100804;
        if (threes >= 1)
          return 2.100803;
        if (twos >= 1)
          return 2.100802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.100706;
        if (fives >= 1)
          return 2.100705;
        if (fours >= 1)
          return 2.100704;
        if (threes >= 1)
          return 2.100703;
        if (twos >= 1)
          return 2.100702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.100605;
        if (fours >= 1)
          return 2.100604;
        if (threes >= 1)
          return 2.100603;
        if (twos >= 1)
          return 2.100602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.100504;
        if (threes >= 1)
          return 2.100503;
        if (twos >= 1)
          return 2.100502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.100403;
        if (twos >= 1)
          return 2.100402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.100302;
    } // if end
    if (nines == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.091413;
        if (queens >= 1)
          return 2.091412;
        if (jacks >= 1)
          return 2.091411;
        if (tens >= 1)
          return 2.091410;
        if (eights >= 1)
          return 2.091408;
        if (sevens >= 1)
          return 2.091407;
        if (sixes >= 1)
          return 2.091406;
        if (fives >= 1)
          return 2.091405;
        if (fours >= 1)
          return 2.091404;
        if (threes >= 1)
          return 2.091403;
        if (twos >= 1)
          return 2.091402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.091312;
        if (jacks >= 1)
          return 2.091311;
        if (tens >= 1)
          return 2.091310;
        if (eights >= 1)
          return 2.091308;
        if (sevens >= 1)
          return 2.091307;
        if (sixes >= 1)
          return 2.091306;
        if (fives >= 1)
          return 2.091305;
        if (fours >= 1)
          return 2.091304;
        if (threes >= 1)
          return 2.091303;
        if (twos >= 1)
          return 2.091302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.091211;
        if (tens >= 1)
          return 2.091210;
        if (eights >= 1)
          return 2.091208;
        if (sevens >= 1)
          return 2.091207;
        if (sixes >= 1)
          return 2.091206;
        if (fives >= 1)
          return 2.091205;
        if (fours >= 1)
          return 2.091204;
        if (threes >= 1)
          return 2.091203;
        if (twos >= 1)
          return 2.091202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.091110;
        if (eights >= 1)
          return 2.091108;
        if (sevens >= 1)
          return 2.091107;
        if (sixes >= 1)
          return 2.091106;
        if (fives >= 1)
          return 2.091105;
        if (fours >= 1)
          return 2.091104;
        if (threes >= 1)
          return 2.091103;
        if (twos >= 1)
          return 2.091102;
      } // if end
      if (tens >= 1) {
        if (eights >= 1)
          return 2.091008;
        if (sevens >= 1)
          return 2.091007;
        if (sixes >= 1)
          return 2.091006;
        if (fives >= 1)
          return 2.091005;
        if (fours >= 1)
          return 2.091004;
        if (threes >= 1)
          return 2.091003;
        if (twos >= 1)
          return 2.091002;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.090807;
        if (sixes >= 1)
          return 2.090806;
        if (fives >= 1)
          return 2.090805;
        if (fours >= 1)
          return 2.090804;
        if (threes >= 1)
          return 2.090803;
        if (twos >= 1)
          return 2.090802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.090706;
        if (fives >= 1)
          return 2.090705;
        if (fours >= 1)
          return 2.090704;
        if (threes >= 1)
          return 2.090703;
        if (twos >= 1)
          return 2.090702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.090605;
        if (fours >= 1)
          return 2.090604;
        if (threes >= 1)
          return 2.090603;
        if (twos >= 1)
          return 2.090602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.090504;
        if (threes >= 1)
          return 2.090503;
        if (twos >= 1)
          return 2.090502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.090403;
        if (twos >= 1)
          return 2.090402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.090302;
    } // if end
    if (eights == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.081413;
        if (queens >= 1)
          return 2.081412;
        if (jacks >= 1)
          return 2.081411;
        if (tens >= 1)
          return 2.081410;
        if (nines >= 1)
          return 2.081409;
        if (sevens >= 1)
          return 2.081407;
        if (sixes >= 1)
          return 2.081406;
        if (fives >= 1)
          return 2.081405;
        if (fours >= 1)
          return 2.081404;
        if (threes >= 1)
          return 2.081403;
        if (twos >= 1)
          return 2.081402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.081312;
        if (jacks >= 1)
          return 2.081311;
        if (tens >= 1)
          return 2.081310;
        if (nines >= 1)
          return 2.081309;
        if (sevens >= 1)
          return 2.081307;
        if (sixes >= 1)
          return 2.081306;
        if (fives >= 1)
          return 2.081305;
        if (fours >= 1)
          return 2.081304;
        if (threes >= 1)
          return 2.081303;
        if (twos >= 1)
          return 2.081302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.081211;
        if (tens >= 1)
          return 2.081210;
        if (nines >= 1)
          return 2.081209;
        if (sevens >= 1)
          return 2.081207;
        if (sixes >= 1)
          return 2.081206;
        if (fives >= 1)
          return 2.081205;
        if (fours >= 1)
          return 2.081204;
        if (threes >= 1)
          return 2.081203;
        if (twos >= 1)
          return 2.081202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.081110;
        if (nines >= 1)
          return 2.081109;
        if (sevens >= 1)
          return 2.081107;
        if (sixes >= 1)
          return 2.081106;
        if (fives >= 1)
          return 2.081105;
        if (fours >= 1)
          return 2.081104;
        if (threes >= 1)
          return 2.081103;
        if (twos >= 1)
          return 2.081102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1) 
          return 2.081009;
        if (sevens >= 1)
          return 2.081007;
        if (sixes >= 1)
          return 2.081006;
        if (fives >= 1)
          return 2.081005;
        if (fours >= 1)
          return 2.081004;
        if (threes >= 1)
          return 2.081003;
        if (twos >= 1)
          return 2.081002;
      } // if end
      if (nines >= 1) {
        if (sevens >= 1)
          return 2.080907;
        if (sixes >= 1)
          return 2.080906;
        if (fives >= 1)
          return 2.080905;
        if (fours >= 1)
          return 2.080904;
        if (threes >= 1)
          return 2.080903;
        if (twos >= 1)
          return 2.080902;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.080706;
        if (fives >= 1)
          return 2.080705;
        if (fours >= 1)
          return 2.080704;
        if (threes >= 1)
          return 2.080703;
        if (twos >= 1)
          return 2.080702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.080605;
        if (fours >= 1)
          return 2.080604;
        if (threes >= 1)
          return 2.080603;
        if (twos >= 1)
          return 2.080602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.080504;
        if (threes >= 1)
          return 2.080503;
        if (twos >= 1)
          return 2.080502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.080403;
        if (twos >= 1)
          return 2.080402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.080302;
    } // if end
    if (sevens == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.071413;
        if (queens >= 1)
          return 2.071412;
        if (jacks >= 1)
          return 2.071411;
        if (tens >= 1)
          return 2.071410;
        if (nines >= 1)
          return 2.071409;
        if (eights >= 1)
          return 2.071408;
        if (sixes >= 1)
          return 2.071406;
        if (fives >= 1)
          return 2.071405;
        if (fours >= 1)
          return 2.071404;
        if (threes >= 1)
          return 2.071403;
        if (twos >= 1)
          return 2.071402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.071312;
        if (jacks >= 1)
          return 2.071311;
        if (tens >= 1)
          return 2.071310;
        if (nines >= 1)
          return 2.071309;
        if (eights >= 1)
          return 2.071308;
        if (sixes >= 1)
          return 2.071306;
        if (fives >= 1)
          return 2.071305;
        if (fours >= 1)
          return 2.071304;
        if (threes >= 1)
          return 2.071303;
        if (twos >= 1)
          return 2.071302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.071211;
        if (tens >= 1)
          return 2.071210;
        if (nines >= 1)
          return 2.071209;
        if (eights >= 1)
          return 2.071208;
        if (sixes >= 1)
          return 2.071206;
        if (fives >= 1)
          return 2.071205;
        if (fours >= 1)
          return 2.071204;
        if (threes >= 1)
          return 2.071203;
        if (twos >= 1)
          return 2.071202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.071110;
        if (nines >= 1)
          return 2.071109;
        if (eights >= 1)
          return 2.071108;
        if (sixes >= 1)
          return 2.071106;
        if (fives >= 1)
          return 2.071105;
        if (fours >= 1)
          return 2.071104;
        if (threes >= 1)
          return 2.071103;
        if (twos >= 1)
          return 2.071102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.071009;
        if (eights >= 1)
          return 2.071008;
        if (sixes >= 1)
          return 2.071006;
        if (fives >= 1)
          return 2.071005;
        if (fours >= 1)
          return 2.071004;
        if (threes >= 1)
          return 2.071003;
        if (twos >= 1)
          return 2.071002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.070908;
        if (sixes >= 1)
          return 2.070906;
        if (fives >= 1)
          return 2.070905;
        if (fours >= 1)
          return 2.070904;
        if (threes >= 1)
          return 2.070903;
        if (twos >= 1)
          return 2.070902;
      } // if end
      if (eights >= 1) {
        if (sixes >= 1)
          return 2.070806;
        if (fives >= 1)
          return 2.070805;
        if (fours >= 1)
          return 2.070804;
        if (threes >= 1)
          return 2.070803;
        if (twos >= 1)
          return 2.070802;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.070605;
        if (fours >= 1)
          return 2.070604;
        if (threes >= 1)
          return 2.070603;
        if (twos >= 1)
          return 2.070602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.070504;
        if (threes >= 1)
          return 2.070503;
        if (twos >= 1)
          return 2.070502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.070403;
        if (twos >= 1)
          return 2.070402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.070302;
    } // if end
    if (sixes == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.061413;
        if (queens >= 1)
          return 2.061412;
        if (jacks >= 1)
          return 2.061411;
        if (tens >= 1)
          return 2.061410;
        if (nines >= 1)
          return 2.061409;
        if (eights >= 1)
          return 2.061408;
        if (sevens >= 1)
          return 2.061407;
        if (fives >= 1)
          return 2.061405;
        if (fours >= 1)
          return 2.061404;
        if (threes >= 1)
          return 2.061403;
        if (twos >= 1)
          return 2.061402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.061312;
        if (jacks >= 1)
          return 2.061311;
        if (tens >= 1)
          return 2.061310;
        if (nines >= 1)
          return 2.061309;
        if (eights >= 1)
          return 2.061308;
        if (sevens >= 1)
          return 2.061307;
        if (fives >= 1)
          return 2.061305;
        if (fours >= 1)
          return 2.061304;
        if (threes >= 1)
          return 2.061303;
        if (twos >= 1)
          return 2.061302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.061211;
        if (tens >= 1)
          return 2.061210;
        if (nines >= 1)
          return 2.061209;
        if (eights >= 1)
          return 2.061208;
        if (sevens >= 1)
          return 2.061207;
        if (fives >= 1)
          return 2.061205;
        if (fours >= 1)
          return 2.061204;
        if (threes >= 1)
          return 2.061203;
        if (twos >= 1)
          return 2.061202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.061110;
        if (nines >= 1)
          return 2.061109;
        if (eights >= 1)
          return 2.061108;
        if (sevens >= 1)
          return 2.061107;
        if (fives >= 1)
          return 2.061105;
        if (fours >= 1)
          return 2.061104;
        if (threes >= 1)
          return 2.061103;
        if (twos >= 1)
          return 2.061102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.061009;
        if (eights >= 1)
          return 2.061008;
        if (sevens >= 1)
          return 2.061007;
        if (fives >= 1)
          return 2.061005;
        if (fours >= 1)
          return 2.061004;
        if (threes >= 1)
          return 2.061003;
        if (twos >= 1)
          return 2.061002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.060908;
        if (sevens >= 1)
          return 2.060907;
        if (fives >= 1)
          return 2.060905;
        if (fours >= 1)
          return 2.060904;
        if (threes >= 1)
          return 2.060903;
        if (twos >= 1)
          return 2.060902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1) 
          return 2.060807;
        if (fives >= 1)
          return 2.060805;
        if (fours >= 1)
          return 2.060804;
        if (threes >= 1)
          return 2.060803;
        if (twos >= 1)
          return 2.060802;
      } // if end
      if (sevens >= 1) {
        if (fives >= 1)
          return 2.060705;
        if (fours >= 1)
          return 2.060704;
        if (threes >= 1)
          return 2.060703;
        if (twos >= 1)
          return 2.060702;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.060504;
        if (threes >= 1)
          return 2.060503;
        if (twos >= 1)
          return 2.060502;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.060403;
        if (twos >= 1)
          return 2.060402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.060302;
    } // if end
    if (fives == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.051413;
        if (queens >= 1)
          return 2.051412;
        if (jacks >= 1)
          return 2.051411;
        if (tens >= 1)
          return 2.051410;
        if (nines >= 1)
          return 2.051409;
        if (eights >= 1)
          return 2.051408;
        if (sevens >= 1)
          return 2.051407;
        if (sixes >= 1)
          return 2.051406;
        if (fours >= 1)
          return 2.051404;
        if (threes >= 1)
          return 2.051403;
        if (twos >= 1)
          return 2.051402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.051312;
        if (jacks >= 1)
          return 2.051311;
        if (tens >= 1)
          return 2.051310;
        if (nines >= 1)
          return 2.051309;
        if (eights >= 1)
          return 2.051308;
        if (sevens >= 1)
          return 2.051307;
        if (sixes >= 1)
          return 2.051306;
        if (fours >= 1)
          return 2.051304;
        if (threes >= 1)
          return 2.051303;
        if (twos >= 1)
          return 2.051302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.051211;
        if (tens >= 1)
          return 2.051210;
        if (nines >= 1)
          return 2.051209;
        if (eights >= 1)
          return 2.051208;
        if (sevens >= 1)
          return 2.051207;
        if (sixes >= 1)
          return 2.051206;
        if (fours >= 1)
          return 2.051204;
        if (threes >= 1)
          return 2.051203;
        if (twos >= 1)
          return 2.051202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.051110;
        if (nines >= 1)
          return 2.051109;
        if (eights >= 1)
          return 2.051108;
        if (sevens >= 1)
          return 2.051107;
        if (sixes >= 1)
          return 2.051106;
        if (fours >= 1)
          return 2.051104;
        if (threes >= 1)
          return 2.051103;
        if (twos >= 1)
          return 2.051102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.051009;
        if (eights >= 1)
          return 2.051008;
        if (sevens >= 1)
          return 2.051007;
        if (sixes >= 1)
          return 2.051006;
        if (fours >= 1)
          return 2.051004;
        if (threes >= 1)
          return 2.051003;
        if (twos >= 1)
          return 2.051002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.050908;
        if (sevens >= 1)
          return 2.050907;
        if (sixes >= 1)
          return 2.050906;
        if (fours >= 1)
          return 2.050904;
        if (threes >= 1)
          return 2.050903;
        if (twos >= 1)
          return 2.050902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.050807;
        if (sixes >= 1)
          return 2.050806;
        if (fours >= 1)
          return 2.050804;
        if (threes >= 1)
          return 2.050803;
        if (twos >= 1)
          return 2.050802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.050706;
        if (fours >= 1)
          return 2.050704;
        if (threes >= 1)
          return 2.050703;
        if (twos >= 1)
          return 2.050702;
      } // if end
      if (sixes >= 1) {
        if (fours >= 1)
          return 2.050604;
        if (threes >= 1)
          return 2.050603;
        if (twos >= 1)
          return 2.050602;
      } // if end
      if (fours >= 1) {
        if (threes >= 1)
          return 2.050403;
        if (twos >= 1)
          return 2.050402;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.050302;
    } // if end
    if (fours == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.041413;
        if (queens >= 1)
          return 2.041412;
        if (jacks >= 1)
          return 2.041411;
        if (tens >= 1)
          return 2.041410;
        if (nines >= 1)
          return 2.041409;
        if (eights >= 1)
          return 2.041408;
        if (sevens >= 1)
          return 2.041407;
        if (sixes >= 1)
          return 2.041406;
        if (fives >= 1)
          return 2.041405;
        if (threes >= 1)
          return 2.041403;
        if (twos >= 1)
          return 2.041402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.041312;
        if (jacks >= 1)
          return 2.041311;
        if (tens >= 1)
          return 2.041310;
        if (nines >= 1)
          return 2.041309;
        if (eights >= 1)
          return 2.041308;
        if (sevens >= 1)
          return 2.041307;
        if (sixes >= 1)
          return 2.041306;
        if (fives >= 1)
          return 2.041305;
        if (threes >= 1)
          return 2.041303;
        if (twos >= 1)
          return 2.041302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.041211;
        if (tens >= 1)
          return 2.041210;
        if (nines >= 1)
          return 2.041209;
        if (eights >= 1)
          return 2.041208;
        if (sevens >= 1)
          return 2.041207;
        if (sixes >= 1)
          return 2.041206;
        if (fives >= 1)
          return 2.041205;
        if (threes >= 1)
          return 2.041203;
        if (twos >= 1)
          return 2.041202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.041110;
        if (nines >= 1)
          return 2.041109;
        if (eights >= 1)
          return 2.041108;
        if (sevens >= 1)
          return 2.041107;
        if (sixes >= 1)
          return 2.041106;
        if (fives >= 1)
          return 2.041105;
        if (threes >= 1)
          return 2.041103;
        if (twos >= 1)
          return 2.041102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.041009;
        if (eights >= 1)
          return 2.041008;
        if (sevens >= 1)
          return 2.041007;
        if (sixes >= 1)
          return 2.041006;
        if (fives >= 1)
          return 2.041005;
        if (threes >= 1)
          return 2.041003;
        if (twos >= 1)
          return 2.041002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.040908;
        if (sevens >= 1)
          return 2.040907;
        if (sixes >= 1)
          return 2.040906;
        if (fives >= 1)
          return 2.040905;
        if (threes >= 1)
          return 2.040903;
        if (twos >= 1)
          return 2.040902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.040807;
        if (sixes >= 1)
          return 2.040806;
        if (fives >= 1)
          return 2.040805;
        if (threes >= 1)
          return 2.040803;
        if (twos >= 1)
          return 2.040802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.040706;
        if (fives >= 1)
          return 2.040705;
        if (threes >= 1)
          return 2.040703;
        if (twos >= 1)
          return 2.040702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.040605;
        if (threes >= 1)
          return 2.040603;
        if (twos >= 1)
          return 2.040602;
      } // if end
      if (fives >= 1) {
        if (threes >= 1)
          return 2.040503;
        if (twos >= 1)
          return 2.040502;
      } // if end
      if (threes >= 1)
        if (twos >= 1)
          return 2.040302;
    } // if end
    if (threes == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.031413;
        if (queens >= 1)
          return 2.031412;
        if (jacks >= 1)
          return 2.031411;
        if (tens >= 1)
          return 2.031410;
        if (nines >= 1)
          return 2.031409;
        if (eights >= 1)
          return 2.031408;
        if (sevens >= 1)
          return 2.031407;
        if (sixes >= 1)
          return 2.031406;
        if (fives >= 1)
          return 2.031405;
        if (fours >= 1)
          return 2.031404;
        if (twos >= 1)
          return 2.031402;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.031312;
        if (jacks >= 1)
          return 2.031311;
        if (tens >= 1)
          return 2.031310;
        if (nines >= 1)
          return 2.031309;
        if (eights >= 1)
          return 2.031308;
        if (sevens >= 1)
          return 2.031307;
        if (sixes >= 1)
          return 2.031306;
        if (fives >= 1)
          return 2.031305;
        if (fours >= 1)
          return 2.031304;
        if (twos >= 1)
          return 2.031302;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.031211;
        if (tens >= 1)
          return 2.031210;
        if (nines >= 1)
          return 2.031209;
        if (eights >= 1)
          return 2.031208;
        if (sevens >= 1)
          return 2.031207;
        if (sixes >= 1)
          return 2.031206;
        if (fives >= 1)
          return 2.031205;
        if (fours >= 1)
          return 2.031204;
        if (twos >= 1)
          return 2.031202;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.031110;
        if (nines >= 1)
          return 2.031109;
        if (eights >= 1)
          return 2.031108;
        if (sevens >= 1)
          return 2.031107;
        if (sixes >= 1)
          return 2.031106;
        if (fives >= 1)
          return 2.031105;
        if (fours >= 1)
          return 2.031104;
        if (twos >= 1)
          return 2.031102;
      } // if end
      if (tens >= 1) {
        if (nines >= 1) 
          return 2.031009;
        if (eights >= 1)
          return 2.031008;
        if (sevens >= 1)
          return 2.031007;
        if (sixes >= 1)
          return 2.031006;
        if (fives >= 1)
          return 2.031005;
        if (fours >= 1)
          return 2.031004;
        if (twos >= 1)
          return 2.031002;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.030908;
        if (sevens >= 1)
          return 2.030907;
        if (sixes >= 1)
          return 2.030906;
        if (fives >= 1)
          return 2.030905;
        if (fours >= 1)
          return 2.030904;
        if (twos >= 1)
          return 2.030902;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.030807;
        if (sixes >= 1)
          return 2.030806;
        if (fives >= 1)
          return 2.030805;
        if (fours >= 1)
          return 2.030804;
        if (twos >= 1)
          return 2.030802;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.030706;
        if (fives >= 1)
          return 2.030705;
        if (fours >= 1)
          return 2.030704;
        if (twos >= 1)
          return 2.030702;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.030605;
        if (fours >= 1)
          return 2.030604;
        if (twos >= 1)
          return 2.030602;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.030504;
        if (twos >= 1)
          return 2.030502;
      } // if end
      if (fours >= 1)
        if (twos >= 1)
          return 2.030402;
    } // if end
    if (twos == 2) {
      if (aces >= 1) {
        if (kings >= 1)
          return 2.021413;
        if (queens >= 1)
          return 2.021412;
        if (jacks >= 1)
          return 2.021411;
        if (tens >= 1)
          return 2.021410;
        if (nines >= 1)
          return 2.021409;
        if (eights >= 1)
          return 2.021408;
        if (sevens >= 1)
          return 2.021407;
        if (sixes >= 1)
          return 2.021406;
        if (fives >= 1)
          return 2.021405;
        if (fours >= 1)
          return 2.021404;
        if (threes >= 1)
          return 2.021403;
      } // if end
      if (kings >= 1) {
        if (queens >= 1)
          return 2.021312;
        if (jacks >= 1)
          return 2.021311;
        if (tens >= 1)
          return 2.021310;
        if (nines >= 1)
          return 2.021309;
        if (eights >= 1)
          return 2.021308;
        if (sevens >= 1)
          return 2.021307;
        if (sixes >= 1)
          return 2.021306;
        if (fives >= 1)
          return 2.021305;
        if (fours >= 1)
          return 2.021304;
        if (threes >= 1)
          return 2.021303;
      } // if end
      if (queens >= 1) {
        if (jacks >= 1)
          return 2.021211;
        if (tens >= 1)
          return 2.021210;
        if (nines >= 1)
          return 2.021209;
        if (eights >= 1)
          return 2.021208;
        if (sevens >= 1)
          return 2.021207;
        if (sixes >= 1)
          return 2.021206;
        if (fives >= 1)
          return 2.021205;
        if (fours >= 1)
          return 2.021204;
        if (threes >= 1)
          return 2.021203;
      } // if end
      if (jacks >= 1) {
        if (tens >= 1)
          return 2.021110;
        if (nines >= 1)
          return 2.021109;
        if (eights >= 1)
          return 2.021108;
        if (sevens >= 1)
          return 2.021107;
        if (sixes >= 1)
          return 2.021106;
        if (fives >= 1)
          return 2.021105;
        if (fours >= 1)
          return 2.021104;
        if (threes >= 1)
          return 2.021103;
      } // if end
      if (tens >= 1) {
        if (nines >= 1)
          return 2.021009;
        if (eights >= 1)
          return 2.021008;
        if (sevens >= 1)
          return 2.021007;
        if (sixes >= 1)
          return 2.021006;
        if (fives >= 1)
          return 2.021005;
        if (fours >= 1)
          return 2.021004;
        if (threes >= 1)
          return 2.021003;
      } // if end
      if (nines >= 1) {
        if (eights >= 1)
          return 2.020908;
        if (sevens >= 1)
          return 2.020907;
        if (sixes >= 1)
          return 2.020906;
        if (fives >= 1)
          return 2.020905;
        if (fours >= 1)
          return 2.020904;
        if (threes >= 1)
          return 2.020903;
      } // if end
      if (eights >= 1) {
        if (sevens >= 1)
          return 2.020807;
        if (sixes >= 1)
          return 2.020806;
        if (fives >= 1)
          return 2.020805;
        if (fours >= 1)
          return 2.020804;
        if (threes >= 1)
          return 2.020803;
      } // if end
      if (sevens >= 1) {
        if (sixes >= 1)
          return 2.020706;
        if (fives >= 1)
          return 2.020705;
        if (fours >= 1)
          return 2.020704;
        if (threes >= 1)
          return 2.020703;
      } // if end
      if (sixes >= 1) {
        if (fives >= 1)
          return 2.020605;
        if (fours >= 1)
          return 2.020604;
        if (threes >= 1)
          return 2.020603;
      } // if end
      if (fives >= 1) {
        if (fours >= 1)
          return 2.020504;
        if (threes >= 1)
          return 2.020503;
      } // if end
      if (fours >= 1)
        if (threes >= 1)
          return 2.020403;
    } // if end    

    double ret = 1.0;
    int number1, number2;
    switch(num1) {
      case "Ace":
        number1 = 14;
        break;
      case "King":
        number1 = 13;
        break;
      case "Queen":
        number1 = 12;
        break;
      case "Jack":
        number1 = 11;
        break;
      default:
        number1 = Integer.valueOf(num1);
    } // switch end
    switch(num2) {
      case "Ace":
        number2 = 14;
        break;
      case "King":
        number2 = 13;
        break;
      case "Queen":
        number2 = 12;
        break;
      case "Jack":
        number2 = 11;
        break;
      default:
        number2 = Integer.valueOf(num2);
    } // switch end
    if (number1 > number2) {
      ret += (number1 / 100.0);
      ret += (number2 / 10000.0);
    } // if end
    if (number2 > number1) {
      ret += (number2 / 100.0);
      ret += (number1 / 10000.0);
    } // if end
    return ret;
  } // method end
} // Class end