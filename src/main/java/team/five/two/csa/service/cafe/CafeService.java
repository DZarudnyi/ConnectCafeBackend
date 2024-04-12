package team.five.two.csa.service.cafe;

import java.util.List;
import team.five.two.csa.dto.cafe.CafeDto;
import team.five.two.csa.dto.cafe.RegisterCafeRequestDto;
import team.five.two.csa.dto.cafe.UpdateCafeRequestDto;

public interface CafeService {
    List<CafeDto> getAllCafes();
    CafeDto getCafeById(Long id);
    CafeDto rateCafe(Long cafeId);
    CafeDto registerCafe(RegisterCafeRequestDto requestDto);
    CafeDto updateCafeInfo(UpdateCafeRequestDto requestDto);
    void deleteCafe(Long id);
}
