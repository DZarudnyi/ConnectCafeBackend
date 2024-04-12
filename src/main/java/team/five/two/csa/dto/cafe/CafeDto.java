package team.five.two.csa.dto.cafe;

public record CafeDto(
        Long id,
        String name,
        String cuisine,
        float rating,
        String city,
        String address,
        String phone
) {
}
