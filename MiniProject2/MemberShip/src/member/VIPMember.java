package member;

public class VIPMember extends Member {
    // To-do VIPMember는 Member에서 상속을 받습니다.
    // To-do 전담 상담원 아이디 속성을 추가합니다
    private int agentId;

    public VIPMember() {
        // To-do 등급을 VIP로 설정해 줍니다.
        memberGrade = "VIP";
    }

    public VIPMember(int memberId, String memberName, int agentId) {
        // To-do
        this();
        this.memberId = memberId;
        this.memberName = memberName;
        this.agentId = agentId;
    }

    @Override
    public String showMemberInfo() {
        // To-do VIP 정보를 보여주는 showMemberInfo 메서드를 재정의하고, 상담원 정보도 보여주도록 합니다
        return super.showMemberInfo() + ", Agent ID: " + agentId;
    }
}
