import React from "react";
import Box from '@mui/material/Box';
import Drawer from '@mui/material/Drawer';
import Toolbar from '@mui/material/Toolbar';
import List from '@mui/material/List';
import Divider from '@mui/material/Divider';
import ListItem from '@mui/material/ListItem';
import ListItemButton from '@mui/material/ListItemButton';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import AppsOutlined from '@mui/icons-material/AppsOutlined';
import CreditCardOutlined from '@mui/icons-material/CreditCardOutlined';
import AttachMoneyOutlined from '@mui/icons-material/AttachMoneyOutlined';
import SettingsOutlined from '@mui/icons-material/SettingsOutlined';

export default class SideNavigation extends React.Component {

  render() {
    return (
      <Drawer
          variant="permanent"
          sx={{
            width: 240,
            flexShrink: 0,
            [`& .MuiDrawer-paper`]: { width: 240, boxSizing: 'border-box' },
          }}
        >
        <Toolbar />
        <Box sx={{ overflow: 'auto' }}>
          <List>
            <ListItem key="Overview" disablePadding>
              <ListItemButton>
                <ListItemIcon>
                  <AppsOutlined />
                </ListItemIcon>
                <ListItemText primary="Overview" />
              </ListItemButton>
            </ListItem>
            <ListItem key="Accounts" disablePadding>
              <ListItemButton>
                <ListItemIcon>
                  <CreditCardOutlined />
                </ListItemIcon>
                <ListItemText primary="Accounts" />
              </ListItemButton>
            </ListItem>
            <ListItem key="Transfers" disablePadding>
              <ListItemButton>
                <ListItemIcon>
                  <AttachMoneyOutlined />
                </ListItemIcon>
                <ListItemText primary="Transfers" />
              </ListItemButton>
            </ListItem>
          </List>
          <Divider />
          <List>
            <ListItem key="Settings" disablePadding>
              <ListItemButton>
                <ListItemIcon>
                  <SettingsOutlined />
                </ListItemIcon>
                <ListItemText primary="Settings" />
              </ListItemButton>
            </ListItem>
          </List>
        </Box>
      </Drawer>
    );
  }
}