package by.gsu.pms;

import java.util.Scanner;

public class PurchasesFactory {
    private enum PurchaseKind {
        Common_Purchase {
            Purchase getPurchase(Scanner sc) {
                return new Purchase(sc);
            }
        }, Price {
            Purchase getPurchase(Scanner sc) {
                return new Price(sc);
            }
        }, Percent {
            Purchase getPurchase(Scanner sc) {
                return new Percent(sc);
            }
        };

        abstract Purchase getPurchase(Scanner sc);
    }

    public static Purchase getPurchaseFromFactory(Scanner sc) {
        PurchaseKind kind = PurchaseKind.valueOf(sc.next());
        return kind.getPurchase(sc);
    }
}