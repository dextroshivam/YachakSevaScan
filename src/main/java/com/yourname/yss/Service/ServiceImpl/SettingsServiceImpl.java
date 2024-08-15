//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Entity.Settings;
//import com.yourname.yss.Repository.SettingsRepository;
//import com.yourname.yss.Service.SettingsService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class SettingsServiceImpl implements SettingsService {
//
//    private final SettingsRepository settingsRepository;
//
//    @Override
//    public Optional<Settings> getSettingsById(Long settingsId) {
//        return settingsRepository.findById(settingsId);
//    }
//
//    @Override
//    public Settings createSettings(Settings settings) {
//        return settingsRepository.save(settings);
//    }
//
//    @Override
//    public Settings updateSettings(Settings settings) {
//        return settingsRepository.save(settings);
//    }
//
//    @Override
//    public void deleteSettings(Long settingsId) {
//        settingsRepository.deleteById(settingsId);
//    }
//}
