import org.apache.commons.lang3.StringUtils;
import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/14/22:39
 */
public class FastDFSTest {

    @Test
    public void test() throws Exception {
//        String filename = file.getOriginalFilename();
        //获得文件后缀名
        String suffix = ".jpg";
        /**
         * 三种方式获得resources 下面的配置文件
         * 1、ClientGlobal.init("H:\\workingspaceA\\JavaA\\IDEA\\ProjectA\\afengshortvideo2.0\\common\\src\\main\\resources\\fastdfs-client.properties");
         *      里面放的是绝对路径，但是一般不这么直接放绝对路径，而是通过第2种方式
         * 2、String fdfsPath = new ClassPathResource("fastdfs-client.properties").getFile().getAbsolutePath();
         *      通过这个方法获得resources下的"fastdfs-client.properties"文件，再获得其绝对路径
         *    ClientGlobal.init(fdfsPath); 将其放入init方法中
         *      要求这两种方式，都需要配置文件各参数前面都不带"fastfds."才可以
         * 3、ClientGlobal.initByProperties("fastdfs-client.properties");
         *      这样直接获取，但是需要配置文件中需要带前缀"fastfds."
         */
//        ClientGlobal.init("H:\\workingspaceA\\JavaA\\IDEA\\ProjectA\\afengshortvideo2.0\\common\\src\\main\\resources\\fastdfs-client.properties");
//        String fdfsPath = new ClassPathResource("fastdfs-client.properties").getFile().getAbsolutePath();
//        ClientGlobal.init(fdfsPath);
        ClientGlobal.initByProperties("fastdfs-client.properties");
        //创建管理端对象
        TrackerClient client = new TrackerClient();
        //通过管理端获得连接
//        TrackerServer connection = client.getConnection();
//        StorageClient1 storageClient1 = new StorageClient1(connection, null);
//        NameValuePair[] meta_list = new NameValuePair[1];
        // 需要传入文件名
//        meta_list[0] = new NameValuePair("fileName", filename);

//        System.out.println(meta_list);
//        System.out.println(file.getBytes());
//        String path = storageClient1.upload_file1(file.getBytes(), suffix, meta_list);


        TrackerServer trackerServer = client.getConnection();
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);

        String[] strings = storageClient.upload_file("H:\\桌面\\壁纸\\4K动漫\\白月魁超清壁纸3840x2160.jpg", suffix, null);
        for (String string : strings) {
            System.out.println(string);
        }
    }

}
