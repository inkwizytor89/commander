package com.gameforge.ogame;

import org.jetbrains.annotations.NotNull;

public class AttackPlanPosition implements Comparable {
    public SourcePlanet sourcePlanet;
    public TargetPlanet targetPlanet;
    public Double priority;


    public void calculatePriority() {
        priority = targetPlanet.calculateDistance(sourcePlanet) * targetPlanet.power;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return priority.compareTo(((AttackPlanPosition)o).priority);
    }

    private static final String LABEL = "LABEL";
    private static final String PLANET_ID = "PLANET_ID";
    private static final String SHIP_COUNT = "SHIP_COUNT";
    private static final String MAIN_REPORT = "" +
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n" +
            "<head>\n" +
            "\t<meta content=\"text/html; charset=UTF-8\" http-equiv=\"content-type\" />\n" +
            "\t<title>sample</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "</body>\n" +
            "</html>";

    private static final String planPositionPattern = "\n" +
            "<table cellpadding=\"1\" cellspacing=\"1\" border=\"1\">\n" +
            "<thead>\n" +
            "<tr><td rowspan=\"1\" colspan=\"3\">"+LABEL+"</td></tr>\n" +
            "</thead>\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "    <td>open</td>\n" +
            "    <td>https://s147-pl.ogame.gameforge.com/game/index.php?page=fleet1&cp="+PLANET_ID+"<datalist><option>https://s147-pl.ogame.gameforge.com/game/index.php?page=fleet1&cp="+PLANET_ID+"</option></datalist></td>\n" +
            "    <td></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>id=ship_202<datalist><option>id=ship_202</option><option>name=am202</option><option>//input[@id='ship_202']</option><option>//li[@id='button202']/input</option><option>//div[3]/ul/li/input</option></datalist></td>\n" +
            "    <td>28,5</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>type</td>\n" +
            "    <td>id=ship_202<datalist><option>id=ship_202</option><option>name=am202</option><option>//input[@id='ship_202']</option><option>//li[@id='button202']/input</option><option>//div[3]/ul/li/input</option></datalist></td>\n" +
            "    <td>"+SHIP_COUNT+"</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>//div[@id='allornone']/div<datalist><option>//div[@id='allornone']/div</option><option>//div[5]/div[2]/div[2]/div</option></datalist></td>\n" +
            "    <td>482,43</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>//a[@id='continue']/span<datalist><option>//a[@id='continue']/span</option><option>//div[2]/div/a/span</option></datalist></td>\n" +
            "    <td>58,17</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>id=system<datalist><option>id=system</option><option>name=system</option><option>//input[@id='system']</option><option>//td[@id='target']/div[3]/input[2]</option><option>//div[3]/input[2]</option></datalist></td>\n" +
            "    <td>14,2</td>\n" +
            "</tr>\n" +
            "<tr>" +
            "   <td>type</td>\n" +
            "   <td>id=galaxy<datalist><option>id=galaxy</option><option>name=galaxy</option><option>//input[@id='galaxy']</option><option>//td[@id='target']/div[3]/input</option><option>//div[3]/input</option></datalist>\n" +
            "   </td><td>1</td>\n" +
            "</tr>" +
            "<tr>\n" +
            "    <td>type</td>\n" +
            "    <td>id=system<datalist><option>id=system</option><option>name=system</option><option>//input[@id='system']</option><option>//td[@id='target']/div[3]/input[2]</option><option>//div[3]/input[2]</option></datalist></td>\n" +
            "    <td>374</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>id=position<datalist><option>id=position</option><option>name=position</option><option>//input[@id='position']</option><option>//td[@id='target']/div[3]/input[3]</option><option>//div[3]/input[3]</option></datalist></td>\n" +
            "    <td>27,11</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>type</td>\n" +
            "    <td>id=position<datalist><option>id=position</option><option>name=position</option><option>//input[@id='position']</option><option>//td[@id='target']/div[3]/input[3]</option><option>//div[3]/input[3]</option></datalist></td>\n" +
            "    <td>10</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>//div[@id='buttonz']/div[2]<datalist><option>//div[@id='buttonz']/div[2]</option><option>//div[4]/div[2]</option></datalist></td>\n" +
            "    <td>539,290</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>//a[@id='continue']/span<datalist><option>//a[@id='continue']/span</option><option>//div[2]/div/div/a/span</option></datalist></td>\n" +
            "    <td>20,21</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>//div[@id='missionNameWrapper']/p<datalist><option>//div[@id='missionNameWrapper']/p</option><option>//div[5]/div[2]/div/p</option></datalist></td>\n" +
            "    <td>476,4</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>id=missionButton1<datalist><option>id=missionButton1</option><option>link=Atakuj</option><option>//a[@id='missionButton1']</option><option>//li[@id='button1']/a</option><option>xpath=(//a[contains(@href, 'javascript:void(0);')])[12]</option><option>//div[2]/ul/li[8]/a</option></datalist></td>\n" +
            "    <td>23,34</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>id=missionNameWrapper<datalist><option>id=missionNameWrapper</option><option>//div[@id='missionNameWrapper']</option><option>//div[@id='buttonz']/div[2]/div</option><option>//div[5]/div[2]/div</option></datalist></td>\n" +
            "    <td>496,20</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "    <td>clickAt</td>\n" +
            "    <td>//a[@id='start']/span<datalist><option>//a[@id='start']/span</option><option>//div[2]/a[2]/span</option></datalist></td>\n" +
            "    <td>164,31</td>\n" +
            "</tr>\n" +
            "</tbody></table>\n" +
            "";
}
