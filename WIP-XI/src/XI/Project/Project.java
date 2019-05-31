/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class Project {

    public static void main(String[] args) {
        int item = 250;
        int limit = 499;
        int menu;
        int amount;

        System.out.println("1.add");
        System.out.println("2.remove");
        System.out.println("3.check");

        Scanner input = new Scanner(System.in);
        menu = input.nextInt();
        if (menu == 1) {
            if (item < limit) {
                amount = input.nextInt();
                if (item + amount > limit) {
                    System.out.println("ไอเท็มเกินนะคับ");
                } else {
                    item = item + amount;
                    System.out.println("item" + item);
                    System.out.println("limit" + limit);

                }

            }

        } else if (menu == 2) {
            if (item <= 0) {
                System.out.println("ไอเท็มไม่พอนะคับ");

            } else {
                amount = input.nextInt();
                if (item - amount >= 0) {
                    item = item - amount;
                    System.out.println("item" + item);
                    System.out.println("limit" + limit);
                } else {
                    System.out.println("ไอเท็มลบไม่ได้นะคับ");
                }

            }

        } else if (menu==3) {
            System.out.println("item" + item);
                    System.out.println("limit" + limit);
        }
        else {
            System.out.println("ไม่มีเมนูนี้นะคับ");
        }
      
    }

}
