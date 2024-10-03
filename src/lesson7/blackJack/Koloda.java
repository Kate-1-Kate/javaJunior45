package lesson7.blackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
private Card[] koloda = new Card[52];

public Koloda(){
    koloda[0] = new Card("Двойка трефа",2);
    koloda[1] = new Card("Двойка бубна",2);
    koloda[2] = new Card("Двойка пика",2);
    koloda[3] = new Card("Двойка черви",2);

    koloda[4] = new Card("Тройка трефа",3);
    koloda[5] = new Card("Тройка бубна",3);
    koloda[6] = new Card("Тройка пика",3);
    koloda[7] = new Card("Тройка черви",3);

    koloda[8] = new Card("Четвёрка трефа",4);
    koloda[9] = new Card("Четвёрка бубна",4);
    koloda[10] = new Card("Четвёрка пика",4);
    koloda[11] = new Card("Четвёрка черви",4);

    koloda[12] = new Card("Пятёрка трефа",5);
    koloda[13] = new Card("Пятёрка бубна",5);
    koloda[14] = new Card("Пятёрка пика",5);
    koloda[15] = new Card("Пятёрка черви",5);

    koloda[16] = new Card("Шестёрка трефа",6);
    koloda[17] = new Card("Шестёрка бубна",6);
    koloda[18] = new Card("Шестёрка пика",6);
    koloda[19] = new Card("Шестёрка черви",6);

    koloda[20] = new Card("Семёрка трефа",7);
    koloda[21] = new Card("Семёрка бубна",7);
    koloda[22] = new Card("Семёрка пика",7);
    koloda[23] = new Card("Семёрка черви",7);

    koloda[24] = new Card("Восьмёрка трефа",8);
    koloda[25] = new Card("Восьмёрка бубна",8);
    koloda[26] = new Card("Восьмёрка пика",8);
    koloda[27] = new Card("Восьмёрка черви",8);

    koloda[28] = new Card("Девятка трефа",9);
    koloda[29] = new Card("Девятка бубна",9);
    koloda[30] = new Card("Девятка пика",9);
    koloda[31] = new Card("Девятка черви",9);

    koloda[32] = new Card("Десятка трефа",10);
    koloda[33] = new Card("Десятка бубна",10);
    koloda[34] = new Card("Десятка пика",10);
    koloda[35] = new Card("Десятка черви",10);

    koloda[36] = new Card("Валет трефа",10);
    koloda[37] = new Card("Валет бубна",10);
    koloda[38] = new Card("Валет пика",10);
    koloda[39] = new Card("Валет черви",10);

    koloda[40] = new Card("Дама трефа",10);
    koloda[41] = new Card("Дама бубна",10);
    koloda[42] = new Card("Дама пика",10);
    koloda[43] = new Card("Дама черви",10);

    koloda[44] = new Card("Король трефа",10);
    koloda[45] = new Card("Король бубна",10);
    koloda[46] = new Card("Король пика",10);
    koloda[47] = new Card("Король черви",10);

    koloda[48] = new Card("Туз трефа",11);
    koloda[49] = new Card("Туз бубна",11);
    koloda[50] = new Card("Туз пика",11);
    koloda[51] = new Card("Туз черви",11);
}
public Card randomCard(){
    int random = ThreadLocalRandom.current().nextInt(0,52);
    return koloda[random];
}
}
