package org.hraink.futures.ctp.trader;

import java.util.concurrent.TimeUnit;

import org.hraink.futures.ctp.thostftdcuserapidatatype.ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE;
import org.hraink.futures.jctp.trader.JCTPTraderApi;
import org.hraink.futures.jctp.trader.JCTPTraderSpi;
import org.junit.Test;

public class TestTrader {
	/** 前置机地址 **/
	String frontAddr = "tcp://116.228.234.67:41205";
	/** 行情API **/
	JCTPTraderApi traderApi;
	JCTPTraderSpi traderSpi;

	@Test
	public void spiTest() throws InterruptedException {
		String dataPath = "/com.fick.smd/ctpdata/test/";

		// traderApi = JCTPTraderApi.createFtdcTraderApi();
		traderApi = JCTPTraderApi.createFtdcTraderApi(dataPath);

		traderSpi = new MyTraderSpi(traderApi);

		// 注册traderpi
		traderApi.registerSpi(traderSpi);
		// 注册公有流
		traderApi.subscribePublicTopic(THOST_TE_RESUME_TYPE.THOST_TERT_RESTART);
		// 注册私有流
		traderApi.subscribePrivateTopic(THOST_TE_RESUME_TYPE.THOST_TERT_RESTART);
		// 注册前置机地址
		traderApi.registerFront(frontAddr);

		traderApi.init();
		// traderApi.join();
		TimeUnit.SECONDS.sleep(2);
		// 回收api和JCTP
		traderApi.release();
		System.out.println("over");

	}
}
