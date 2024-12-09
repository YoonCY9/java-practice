package ClassXList1209;

import java.util.Objects;

public class Member {

    private String id;
    private String nickname;
    private String password;

    public Member(String id, String nickname, String password) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(nickname, member.nickname) && Objects.equals(password, member.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, password);
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }
}
