package LinkedList;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Nicolas on 8/11/2017.
 */
public class Q5Test {

    @Test
    public void testSumListReverseOrder() throws Exception {
        //617 + 295 = 912
        LinkedListNode head1 = new LinkedListNode(7);
        head1.next = new LinkedListNode(1);
        head1.next.next = new LinkedListNode(6);

        LinkedListNode head2 = new LinkedListNode(5);
        head2.next = new LinkedListNode(9);
        head2.next.next = new LinkedListNode(2);

        LinkedListNode expected = new LinkedListNode(2);
        expected.next = new LinkedListNode(1);
        expected.next.next = new LinkedListNode(9);

        LinkedListNode result = Q5.sumListReverseOrder(head1, head2);

        while (result != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }

        //617 + 52 = 669
        head1 = new LinkedListNode(7);
        head1.next = new LinkedListNode(1);
        head1.next.next = new LinkedListNode(6);

        head2 = new LinkedListNode(2);
        head2.next = new LinkedListNode(5);

        expected = new LinkedListNode(9);
        expected.next = new LinkedListNode(6);
        expected.next.next = new LinkedListNode(6);

        result = Q5.sumListReverseOrder(head1, head2);

        while (result != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }

        //617 + 617 = 1234
        head1 = new LinkedListNode(7);
        head1.next = new LinkedListNode(1);
        head1.next.next = new LinkedListNode(6);

        head2 = new LinkedListNode(7);
        head2.next = new LinkedListNode(1);
        head2.next.next = new LinkedListNode(6);


        expected = new LinkedListNode(4);
        expected.next = new LinkedListNode(3);
        expected.next.next = new LinkedListNode(2);
        expected.next.next.next = new LinkedListNode(1);

        result = Q5.sumListReverseOrder(head1, head2);

        while (result != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }

    }


    @Test
    public void testSumListForwardOrder() throws Exception {
        //617 + 295 = 912
        LinkedListNode head1 = new LinkedListNode(6);
        head1.next = new LinkedListNode(1);
        head1.next.next = new LinkedListNode(7);

        LinkedListNode head2 = new LinkedListNode(2);
        head2.next = new LinkedListNode(9);
        head2.next.next = new LinkedListNode(5);

        LinkedListNode expected = new LinkedListNode(9);
        expected.next = new LinkedListNode(1);
        expected.next.next = new LinkedListNode(2);

        LinkedListNode result = Q5.sumListForwardOrder(head1, head2);

        while (result != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }

        //617 + 52 = 669
        head1 = new LinkedListNode(6);
        head1.next = new LinkedListNode(1);
        head1.next.next = new LinkedListNode(7);

        head2 = new LinkedListNode(5);
        head2.next = new LinkedListNode(2);

        expected = new LinkedListNode(6);
        expected.next = new LinkedListNode(6);
        expected.next.next = new LinkedListNode(9);

        result = Q5.sumListForwardOrder(head1, head2);

        while (result != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }

        //617 + 617 = 1234
        head1 = new LinkedListNode(6);
        head1.next = new LinkedListNode(1);
        head1.next.next = new LinkedListNode(7);

        head2 = new LinkedListNode(6);
        head2.next = new LinkedListNode(1);
        head2.next.next = new LinkedListNode(7);


        expected = new LinkedListNode(1);
        expected.next = new LinkedListNode(2);
        expected.next.next = new LinkedListNode(3);
        expected.next.next.next = new LinkedListNode(4);

        result = Q5.sumListForwardOrder(head1, head2);

        while (result != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }
    }
}
