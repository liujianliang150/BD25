<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no,minimal-ui">
    <title>名师</title>
    <meta name="keywords" content="超神学院,IT在线视频教程,Java视频,HTML5视频,前端视频,Python视频,大数据视频" />
    <meta name="description" content="超神学院是国内领先的IT在线视频学习平台、职业教育平台。截止目前,超神学院线上、线下学习人次数以万计！会同上百个知名开发团队联合制定的Java、HTML5前端、大数据、Python等视频课程，被广大学习者及IT工程师誉为：业界最适合自学、代码量最大、案例最多、实战性最强、技术最前沿的IT系列视频课程！" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />
    <meta content="telephone=no" name="format-detection" />
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/theme.css">
    <link rel="stylesheet" type="text/css" href="css/global.css">
    <link rel="stylesheet" type="text/css" href="css/web.css">
</head>

<body class="W-body">
    <div class="in-wrap">

        <!-- /公共头引入 -->
        <jsp:include page="common/top.jsp"></jsp:include>
        <!-- /公共头引入 -->

        <div id="aCoursesList" class="bg-fa of">
            <!-- 讲师列表 开始 -->
            <section class="container">
                <section class="c-sort-box unBr">
                    <div>
                        <!-- /无数据提示 开始-->
					    <jsp:include page="common/nothing.jsp"></jsp:include>
                        <!-- /无数据提示 结束-->
                        <article class="i-teacher-list">
                            <ul class="of">
                                <li>
                                    <section class="i-teach-wrap">
                                        <div class="i-teach-pic">
<%--                                            教师姓名--%>
                                            <a href="teacher_info.jsp" title="佟老师" target="_blank">
                                                <img src="photo/teacher/01.jpg" alt="" width="142" height="142">
                                            </a>
                                        </div>
                                        <div class="mt10 hLh30 txtOf tac">
<%--                                            教师姓名--%>
                                            <a href="teacher_info.jsp" title="佟老师" class="fsize18 c-666">佟老师</a>
                                        </div>
                                        <div class="hLh30 txtOf tac">
                                            
                                            <span class="fsize14 c-999">尚硅谷教学总监</span>
                                        </div>
                                        <div class="mt15 i-q-txt">
                                            <p class="c-999 f-fA">资深项目经理、技术讲师、SUN SCJP、SCWCD、原工信部移动云计算教育培训中心教学总监。 十年软件开发经验：参与完成辽宁某高校远程教学管理系统、慧文信息门户系统、日本麦卡尔超市管理系统、崎玉市外来人口登记系统、深海视频会议管理系统、仙台市宫城县日常事务系统等项目的设计和开发。 十年软件培训经验：曾在中国AOP全球外包排名第一的公司任Java、Oracle培训讲师、负责对公司员工新技术培训；曾任花旗银行特约JavaEE培训讲师；某部队研究所JavaEE培训；曾受聘为北航、厦门大学移动云计算专业教学主任， 并主讲Java、Android、iOS课程。</p>
                                        </div>
                                    </section>
                                 </li>
                                <li>
                                    <section class="i-teach-wrap">
                                        <div class="i-teach-pic">
                                            <a href="#" title="韩老师">
                                                <img alt="韩老师" src="photo/teacher/02.jpg">
                                            </a>
                                        </div>
                                        <div class="mt10 hLh30 txtOf tac">
                                            <a href="#" title="韩老师" class="fsize18 c-666">韩老师</a>
                                        </div>
                                        <div class="hLh30 txtOf tac">
                                            <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                        </div>
                                        <div class="mt15 i-q-txt">
                                            <p class="c-999 f-fA">行业老兵，IT教育风云人物。清华毕业，拥有九年大型项目开发和管理经验，曾任新浪网软件项目经理，使用PHP与JavaEE技术开发新浪网系统，北京点击科技公司高级软件工程师，用友软件股份有限公司U8事业部软件工程师。主持或参与《新浪邮件系统》、《橙红sns网站》、《点击科技协同软件群组服务器端(Linux/solaris平台)》、《总参语音监控系统》、《英语学习机系统》、《用友erp(u8产品)系统》等项目。实战经验丰富，授课通俗易懂，多年来培训的学员已成功在用友、搜狐、淘宝、中软等知名企业就职。 代表作品《循序渐进学Java》《尚硅谷韩顺平Linux》《尚硅谷韩顺平Go语言》。</p>
                                        </div>
                                    </section>
                                </li>
                                <li>
                                    <section class="i-teach-wrap">
                                        <div class="i-teach-pic">
                                            <a href="#" title="李老师">
                                                <img alt="李老师" src="photo/teacher/03.jpg">
                                            </a>
                                        </div>
                                        <div class="mt10 hLh30 txtOf tac">
                                            <a href="#" title="李老师" class="fsize18 c-666">李老师</a>
                                        </div>
                                        <div class="hLh30 txtOf tac">
                                            <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                        </div>
                                        <div class="mt15 i-q-txt">
                                            <p class="c-999 f-fA">从业十七年，曾任即时Linux研究院副院长、PHPChina技术总监等职，国内早期的UNIX/Linux从业者，中国UNIX用户协会成员，首批红旗Linux认证讲师。先后出版过《UNIX系统管理实用教程》、《UNIX网络管理实用教程》、《Sun Solaris 8系统管理员指南》、《PHP5项目开发实战详解》、《完美应用Ubuntu》等多本计算机技术图书，国内多所大学外聘讲师，《开放系统世界》及《网络与运维》等杂志专栏作家。近年来致力于Linux/LAMP开源技术推广及职业教育，录制的Linux视频教程是无数从业者的入门宝典；出版的就业指导图书《明哥聊求职》广受好评；2017年明哥聊求职获教育行业优秀自媒体奖。</p>
                                        </div>
                                    </section>
                                </li>
                                <li>
                                    <section class="i-teach-wrap">
                                        <div class="i-teach-pic">
                                            <a href="teacher_info.jsp" title="宋老师" target="_blank">
                                                <img src="photo/teacher/04.jpg" alt="" width="142" height="142">
                                            </a>
                                        </div>
                                        <div class="mt10 hLh30 txtOf tac">
                                            <a href="teacher_info.jsp" title="宋老师" class="fsize18 c-666">宋老师</a>
                                        </div>
										<div class="hLh30 txtOf tac">
                                            <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                        </div>
                                        <div class="mt15 i-q-txt">
                                            <p class="c-999 f-fA">东北师大理学学士，北京航空航天大学硕士，曾于北航软件开发环境国家重点实验室研究多项课题，对智能交通—浮动车海量数据挖掘及在线社交网络信息传播和控制问题有深入研究，曾发表论文数篇。先后担任过高级软件开发工程师，系统架构师，高级讲师。具备丰富的软件开发经验和教学经验。精通C/C++、Java、Objective-C 等开发语言， 对JavaEE、Android开发有深入理解，对以Java语言为基础的各种框架有深入研究。亲自主持开发过多个大型项目，具备很强的项目管理能力和丰富的项目实施经验。</p>
                                        </div>
                                    </section>
                                </li>
                                <li>
                                    <section class="i-teach-wrap">
                                        <div class="i-teach-pic">
                                            <a href="teacher_info.jsp" title="周老师" target="_blank">
                                                <img src="photo/teacher/05.jpg" alt="" width="142" height="142">
                                            </a>
                                        </div>
                                        <div class="mt10 hLh30 txtOf tac">
                                            <a href="teacher_info.jsp" title="周老师" class="fsize18 c-666">周老师</a>
                                        </div>
                                        <div class="hLh30 txtOf tac">
                                            <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                        </div>
                                        <div class="mt15 i-q-txt">
                                            <p class="c-999 f-fA">多年一线开发及管理经验，曾先后就职于神华和信、亚信联创、安润金融等大中型互联网公司，任技术经理、项目经理、架构师等职位。历经电信、互联网金融等热门行业的项目历练，对传统JavaEE技术体系、云计算、大数据及当下热门的互联网技术都具有深厚的技术功底。 能够将企业流行、实用的技术带回课堂，引导学生少走弯路。</p>
                                        </div>
                                    </section>
                                </li>
                                <li>
                                    <section class="i-teach-wrap">
                                        <div class="i-teach-pic">
                                            <a href="teacher_info.jsp" title="缪老师" target="_blank">
                                                <img src="photo/teacher/06.jpg" alt="" width="142" height="142">
                                            </a>
                                        </div>
                                        <div class="mt10 hLh30 txtOf tac">
                                            <a href="teacher_info.jsp" title="缪老师" class="fsize18 c-666">缪老师</a>
                                        </div>
                                        <div class="hLh30 txtOf tac">
                                            <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                        </div>
                                        <div class="mt15 i-q-txt">
                                            <p class="c-999 f-fA">辽工大外聘大数据、区块链专家、辽工大保送硕士，曾就职于交大思诺、文思海辉、宅急送等知名企业，历任项目经理、架构师 。多年项目开发、管理经验。精通 Go、Hadoop、Spark、Android、Java、C/C++，对区块链、大数据、Linux 等有深入研究。技术功底深厚，热衷于新技术的研究。从业IT教育多年，学员多任职于腾讯、联想、京东、新浪、Oracle、IBM 等国内外一线互联网公司。人称大海哥，号称尚硅谷第一帅。</p>
                                        </div>
                                    </section>
                                </li>
                                <li>
                                    <section class="i-teach-wrap">
                                        <div class="i-teach-pic">
                                            <a href="teacher_info.jsp" title="封老师" target="_blank">
                                                <img src="photo/teacher/07.jpg" alt="" width="142" height="142">
                                                    </a>
                                        </div>
                                        <div class="mt10 hLh30 txtOf tac">
                                            <a href="teacher_info.jsp" title="封老师" class="fsize18 c-666">封老师</a>
                                        </div>
                                        <div class="hLh30 txtOf tac">
                                            <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                        </div>
                                        <div class="mt15 i-q-txt">
                                            <p class="c-999 f-fA">具多年软件开发经验，曾主持或参与开发《中国电力轨道交通线路数据交换平台》、《SG186工程宁夏电网营销 稽查管理项目》、《天津市广告监管系统》等项目。对JavaEE 技术体系结构、JavaWeb 原理有深刻理解，精通多种主流框架以及 Maven、Ant 等构建工具。 课堂教学循序渐进，深入浅出，主张快乐学习，学以致用。</p>
                                        </div>
                                    </section>
                                </li>
                                <li>
                                    <section class="i-teach-wrap">
                                        <div class="i-teach-pic">
                                            <a href="teacher_info.jsp" title="张老师" target="_blank">
                                                <img src="photo/teacher/08.jpg" alt="" width="142" height="142">
                                                    </a>
                                        </div>
                                        <div class="mt10 hLh30 txtOf tac">
                                            <a href="teacher_info.jsp" title="张老师" class="fsize18 c-666">张老师</a>
                                        </div>
                                        <div class="hLh30 txtOf tac">
                                            <span class="fsize14 c-999">尚硅谷高级讲师</span>
                                        </div>
                                        <div class="mt15 i-q-txt">
                                            <p class="c-999 f-fA">中国人民大学软件工程硕士。精通java核心框架、大数据Hadoop、Spark技术，曾先后就职于南天软件、用友金融、中植集团、百合贷，任技术经理、项目经理、技术部负责人。主持开发了中信银行、国家电网、中植集团、东方资产等大型企业的金融类系统，也对时下流行的互联网金融有深入的研究。 十余年的项目经历，练就了纯厚的技术底蕴和丰富的职场经验。</p>
                                        </div>
                                    </section>
                                </li>
                             </ul>
                            <div class="clear"></div>
                        </article>
                    </div>
                    <!-- 公共分页 开始 -->
                    <div>
                        <div class="paging">
							<a class="undisable" title>首</a>
							<a id="backpage" class="undisable" href="#" title>&lt;</a>
							<a href="#" title class="current undisable">1</a>
							<a href="#" title>2</a>
							<a id="nextpage" href="#" title>&gt;</a>
							<a href="#" title>末</a>
							<div class="clear"></div>
                        </div>
                    </div>
                    <!-- 公共分页 结束 -->
                </section>
            </section>
            <!-- /讲师列表 结束 -->
        </div>

        <!-- 公共底引入 -->
        <jsp:include page="common/bottom.jsp"></jsp:include>
        <!-- 公共底引入 -->
    </div>

</body>

</html>