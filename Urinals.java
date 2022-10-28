package junit_testing;

import java.io.*;
import java.util.*;

public class Urinals {
    public static void main(String[] args) throws IOException {

        Urinals urinals = new Urinals();
        Scanner sc = new Scanner(System.in);
        try {
            File file = new File("src/junit_testing/input");
            FileReader input = new FileReader(file);
            BufferedReader buffer = new BufferedReader(input);
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
                int ct = urinals.countFromString(line);
                System.out.println(ct);
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }


        String str = sc.next();

        // when the input is just a string
        int output1 = urinals.countFromString(str);
        System.out.println(output1);

    }


    public int countFromString(String str) {

        char arr[] = str.toCharArray();
        int len = arr.length;
        int count = 0;
        if (len == 1)
        {
            if (arr[0] == '1') {
                return 0;
            } else {
                return 1;
            }

        }
        for (int i = 0; i < len - 1; i++) {
            if (i == 0) {
                if (arr[i] == '0') {
                    if (arr[i + 1] == '0') {
                        arr[i] = '1';
                        i++;
                        count++;
                    } else {
                        continue;
                    }
                } else {
                    i++;

                }

            } else if (arr[i] == '0' && arr[i - 1] == '0' && arr[i + 1] == '0') {
                arr[i] = '1';
                count++;
                i++;
            } else if (arr[i] == '1' && (arr[i - 1] == '1' || arr[i + 1] == '1')) {
                return -1;
            } else {
                continue;
            }
        }
        if (arr[len - 1] == '0') {
            if (arr[len - 2] == '0') {
                count++;
            }
        }
        if (arr[len - 1] == '1') {
            if (arr[len - 2] == '1') {
                return -1;
            }
        }
        return count;
    }


}