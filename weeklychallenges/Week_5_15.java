package com.example.weeklychallenges;

import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.Set;

public class Week_5_15 {

    public static Node intersects(Node list1Head, Node list2Head) {

        while(list2Head != null) {

            Node temp = list1Head;

            while (temp != null) {

                if(temp == list2Head) {
                    return temp;
                }

                temp = temp.getNextSibling();

            }

            list2Head = list2Head.getNextSibling();

        }

        return null;

    }

    public static Node loopDetection(Node listHead) {

        Set<Node> nodeSet = new HashSet<>();

        while (listHead != null) {

            if(!nodeSet.contains(listHead)) {
                nodeSet.add(listHead);
            } else {
                return listHead;
            }

        }

        return null;

    }

}
