package yooncy.java_practice.MemberTest1209;

import ClassXList1209.Member;
import ClassXList1209.MemberResponse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class test {
    @Test
    void name() {
        Member member1 = new Member("y1212", "yoon", "1234");

        MemberResponse memberResponse1 =
                new MemberResponse(member1.getId(), member1.getNickname());

        assertThat(memberResponse1.getLoginId()).isEqualTo(member1.getId());

    }

    @Test
    void MemberList() {
//        Member member1 = new Member("y1212", "yoon", "1234");
//        Member member2 = new Member("a1212", "aoon", "a234");
//        Member member3 = new Member("c1212", "coon", "c234");
//        MemberResponse memberResponse1 =
//                new MemberResponse(member1.getId(), member1.getNickname());
//        MemberResponse memberResponse2 =
//                new MemberResponse(member2.getId(), member3.getNickname());
//        MemberResponse memberResponse3 =
//                new MemberResponse(member3.getId(), member3.getNickname());

        List<Member> members = List.of(
                new Member("y1212", "yoon", "1234"),
                new Member("a1212", "aoon", "a234"),
                new Member("c1212", "coon", "c234"));


//         memberResponse를 담는 리스트
//        ArrayList<MemberResponse> memberResponses = new ArrayList<>();
//        for (Member member : members) {
//            MemberResponse memberResponse = new MemberResponse(
//                    member.getId(),
//                    member.getNickname());
//            memberResponses.add(memberResponse);
//        }
        List<MemberResponse> memberResponses2 =
                members.stream().map((m) -> new MemberResponse(m)).toList();

        List<MemberResponse> memberResponses3 =
                members.stream().filter((member) -> member.getNickname().isEmpty()
                        ).map((member) -> new MemberResponse(member)).toList();
    }
}
