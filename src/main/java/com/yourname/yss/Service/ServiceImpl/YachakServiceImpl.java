//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.Yachak;
//import com.yourname.yss.Repository.YachakRepository;
//import com.yourname.yss.Service.YachakService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class YachakServiceImpl implements YachakService {
//
//    private final YachakRepository yachakRepository;
//
//    @Override
//    public Optional<Yachak> getYachakById(Long yachakId) {
//        return yachakRepository.findById(yachakId);
//    }
//
//    @Override
//    public Yachak createYachak(Yachak yachak) {
//        return yachakRepository.save(yachak);
//    }
//
//    @Override
//    public Yachak updateYachak(Yachak yachak) {
//        return yachakRepository.save(yachak);
//    }
//
//    @Override
//    public void deleteYachak(Long yachakId) {
//        yachakRepository.deleteById(yachakId);
//    }
//}
