package manager;

import java.util.ArrayList;
import java.util.TreeSet;

import member.Member;

public class SortedManager {

    //To-do 회원을 정렬하여 관리하기 위해 TreeSet을 활용합니다.
    private TreeSet<Member> memberList;

    public SortedManager() {
        memberList = new TreeSet<>();
    }
    //To-do 회원을 추가하는 메서드를 만듭니다.
    public void addMember(Member member) {
        memberList.add(member);
    }

    //To-do 회원을 삭제하는 메서드를 만듭니다.
    public void deleteMember(Member member) {
        memberList.remove(member);
    }

    //To-do 모든 회원을 보여주는 메서드를 구현 합니다.
    public void showAllMember() {
        for (Member member: memberList) {
            System.out.println(member.showMemberInfo());
        }
    }

    //To-do 회원정보를 가져오는 getter를 제공합니다.
    public TreeSet<Member> getMemberList() {
        return memberList;
    }
}
