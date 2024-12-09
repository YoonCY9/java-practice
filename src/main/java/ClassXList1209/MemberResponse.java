package ClassXList1209;

import java.util.Objects;

public class MemberResponse {

    private String loginId;
    private String username;

    public MemberResponse(String id, String nickname) {
        this.loginId = id;
        this.username = nickname;
    }

    public MemberResponse(Member member) {
        this.loginId = member.getId();
        this.username = member.getNickname();

    }

    public String getLoginId() {
        return loginId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberResponse that = (MemberResponse) o;
        return Objects.equals(loginId, that.loginId) && Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginId, username);
    }
}
