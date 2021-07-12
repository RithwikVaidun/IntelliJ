/*
package ApCSA;

import java.util.ArrayList;
import java.util.List;

public class MusicDownloads {
    private List<DownloadInfo> downloadList;

    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo>();
    }

    public DownloadInfo getDownloadInfo(String title) {
        for(int i = 0; i < downloadList.size(); i++ ) {
            if(downloadList.get(i).getTitle.equals(title)) {
                return downloadList.get(i);
            }
        }
        return null; //means title is not in list
    }

    public void updateDownloads(List<String> titles) {
        for(int i = 0; i < titles.size(); i++ ) {
            if(getDownloadInfo(titles.get(i)) == null) {
                downloadList.add(new DownloadInfo(titles.get(i)));
            }
            else {
                DownloadInfo f = new DownloadInfo(titles.get(i));
               f.incrementTimesDownloaded();
            }
        }
    }

}
*/
