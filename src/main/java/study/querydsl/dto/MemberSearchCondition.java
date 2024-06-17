package study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {

    // 회원명, 팀명, 나(ageGoe, ageLoe)
    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;
}
