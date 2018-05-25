package webService;

import com.netfinworks.common.domain.OperationEnvironment;
import com.netfinworks.urm.domain.info.UserAccreditInfo;
import com.netfinworks.urm.domain.info.UserAccreditToken;
import com.netfinworks.urm.domain.query.UserAccreditInfoQuery;
import com.netfinworks.urm.domain.query.UserAccreditTokenQuery;
import com.netfinworks.urm.domainservice.accredit.UserAccreditInfoInter;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import org.junit.jupiter.api.Test;

import java.util.List;

public class WSClientTest {

    @Test
    public void test( ){
        OperationEnvironment environment=new OperationEnvironment();
        JaxWsProxyFactoryBean factory=new JaxWsProxyFactoryBean();
        factory.setServiceClass(UserAccreditInfoInter.class);
        //factory.setAddress("http://192.168.180.42:8502/cxf/userAccreditTokenInter?wsdl");
        factory.setAddress("http://192.168.180.42:8502/cxf/userAccreditInfoInter?wsdl");
        //http://10.251.6.81:8081/ma-web
        UserAccreditInfoInter ia=(UserAccreditInfoInter)factory.create();
        UserAccreditInfoQuery reuqest=new UserAccreditInfoQuery();
        reuqest.setPartner_id("111");
        List<UserAccreditInfo> cc = ia.queryAccreditInfo(reuqest);
        System.out.println(cc);
    }
}
