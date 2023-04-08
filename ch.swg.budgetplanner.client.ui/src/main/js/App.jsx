import React from "react";
import Box from '@mui/material/Box';
import Drawer from '@mui/material/Drawer';
import CssBaseline from '@mui/material/CssBaseline';
import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import List from '@mui/material/List';
import Typography from '@mui/material/Typography';
import Divider from '@mui/material/Divider';
import ListItem from '@mui/material/ListItem';
import ListItemButton from '@mui/material/ListItemButton';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import AppsOutlined from '@mui/icons-material/AppsOutlined';
import CreditCardOutlined from '@mui/icons-material/CreditCardOutlined';
import AttachMoneyOutlined from '@mui/icons-material/AttachMoneyOutlined';
import SettingsOutlined from '@mui/icons-material/SettingsOutlined';

const drawerWidth = 240;

export class App extends React.Component {
  render() {
    return (
      <Box sx={{ display: 'flex' }}>
        <CssBaseline />
        <AppBar position="fixed" sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}>
          <Toolbar>
            <Typography variant="h6" noWrap component="div">
              Budget Planner
            </Typography>
          </Toolbar>
        </AppBar>
        <Drawer
          variant="permanent"
          sx={{
            width: drawerWidth,
            flexShrink: 0,
            [`& .MuiDrawer-paper`]: { width: drawerWidth, boxSizing: 'border-box' },
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
        <Box component="main" sx={{ flexGrow: 1, p: 3 }}>
          <Toolbar />
          <Typography paragraph>
            Hello World!
          </Typography>
        </Box>
      </Box>
    );
  }
}