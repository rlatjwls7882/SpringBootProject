package kr.kro.projectbpm.service;

public interface EncodeService {
    final static long WEIGHT = 128;
    final static long MOD = 1_000_000_007;
    String encodePassword(String password);
    String encodeId(String id);
}
