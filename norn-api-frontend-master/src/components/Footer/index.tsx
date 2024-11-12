import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import '@umijs/max';

const AUTHOE_Bilibili ="https://space.bilibili.com/1427029765";
const Footer: React.FC = () => {
  const defaultMessage = '自制简易API开放平台';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'User_center',
          title: 'api开放平台',
          href: AUTHOE_Bilibili,
          blankTarget: true,
        },
        {
          key: 'github',
          title: <GithubOutlined />,
          href: 'https://github.com/MerrillaElizabeth',
          blankTarget: true,
        },
        {
          key: 'Bilibili',
          title: 'B站',
          href: AUTHOE_Bilibili,
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
