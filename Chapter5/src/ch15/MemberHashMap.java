package ch15;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }

        System.out.println("no element");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()) {
            Member member = hashMap.get(iterator.next());
            System.out.println(member);
        }
    }
}
